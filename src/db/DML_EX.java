package db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DML_EX {
	// 필드, 생성자, 메서드
	
	// 필드
	// 접근제어자 제어자 타입 변수명 [=초기값];
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Statement stmt;
	
	// 생성자
	// 접근제어자 클래스명(매개변수리스트){...};
	
	// 메서드
	// 접근제어자 제어자 리턴타입 메서드명(매개변수리스트){...};
	
	// JDBC Driver등록, Connection 얻기
	public void getDBConnection() {
		// JDBC Driver 등록
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 검색 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패");
			e.printStackTrace();
		}
		
		// 전역변수 초기화
		conn = null;
		pstmt = null;
		rs = null;
		stmt = null;
		
		final String url = "jdbc:oracle:thin:@127.0.0.1:1521/xe";
		final String id = "scott"; // DB사용자계정
		final String pw = "tiger"; // PASSWORD
		
		// 연결 Connection 얻기
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("Connection 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 자원반납
	public void returnResource() {
		try {
			if (conn != null) {conn.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
	}
	// 자원반납
	public void statementReturn(Statement stmt) {
		try {
			if (stmt != null) {stmt.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
	}
	
	// 목록 조회 
	public List<EmployeeDTO> showAllList(){
		// 직원목록
		String sql = "SELECT * FROM emp";
		
		// SELECT문에서 나온 데이터를 저장할 객체 생성
		List<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
		
		try {
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				EmployeeDTO data = new EmployeeDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), 
						rs.getDate(5), rs.getInt(6), rs.getInt(7), rs.getInt(8));
				// 생성자를 통해서 데이터를 입력해도 되지만, set메서드를 통해 하나하나 입력해줘도된다.
				
				list.add(data);
			}
		} catch (SQLException e) {
			System.out.println("에러");
			e.printStackTrace();
		}
		
		return list;
	}
	
	// 상세 조회 (검색-Where) -> 부서 번호로 검색
	public List<EmployeeDTO> showSearchList(int deptNo){
		// 직원목록 WHERE절 검색
		//String sql = "SELECT * FROM emp Where DEPTNO = " + deptNo;
		String sql = "SELECT * FROM emp Where DEPTNO = ?";
		
		// SELECT문에서 나온 데이터를 저장할 객체 생성
		List<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, deptNo);
			
			rs = pstmt.executeQuery(); 	// 미리 sql문 Statement를 준비해 두었기 때문에 매개변수에 sql문을 작성하지 않는다. 
			
			while(rs.next()) {
				EmployeeDTO data = new EmployeeDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), 
						rs.getDate(5), rs.getInt(6), rs.getInt(7), rs.getInt(8));
				
				// 생성자를 통해서 데이터를 입력해도 되지만, set메서드를 통해 하나하나 입력해줘도된다.
				
				list.add(data);
			}
		} catch (SQLException e) {
			System.out.println("에러");
			e.printStackTrace();
		}
		statementReturn(pstmt);
		
		return list;
	}
	
	// 입력하기 (매개변수 O) - main에서 입력
	public void insertEmployee(int empNO, String eName, String job, int mgr,
			String h_date, int sal, int comm, int deptNo) {
		String sql = "INSERT INTO emp VALUES(?,?,?,?,?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, empNO);
			pstmt.setString(2, eName);
			pstmt.setString(3, job);
			pstmt.setInt(4, mgr);
			pstmt.setDate(5, Date.valueOf(h_date));
			pstmt.setInt(6, sal);
			pstmt.setInt(7, comm);
			pstmt.setInt(8, deptNo);
			
            int result = pstmt.executeUpdate();
            
            if(result>0) {	// result가 1이상이면 하나는 작업했다는 의미 
                System.out.println("데이터 삽입 성공!");
            }
            
		} catch (SQLException e) {
			System.err.println("INSERT 실패");
			System.out.println(e);
			System.exit(0);
		}
	}
	
	// 수정하기 (매개변수 O) - main에서 입력
	public void updateEmployee(int empNO,  String job, int sal, int comm) {
		String sql = "UPDATE emp SET job = ?, sal = ?, comm =? WHERE EMPNO = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, job);
			pstmt.setInt(2, sal);
			pstmt.setInt(3, comm);
			pstmt.setInt(4, empNO);
			
            int result = pstmt.executeUpdate();
            
            if(result>0) {	// result가 1이상이면 하나는 작업했다는 의미 
                System.out.println("데이터 수정 성공!");
            }
            
		} catch (SQLException e) {
			System.err.println("UPDATE 실패");
			System.out.println(e);
			System.exit(0);
		}
	}
		
	
	// 삭제하기 
	public void deleteEmployee(int empNO) {
		String sql = "DELETE FROM emp WHERE EMPNO = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, empNO);
			
            int result = pstmt.executeUpdate();
            
            if(result>0) {	// result가 1이상이면 하나는 작업했다는 의미 
                System.out.println("데이터 삭제 성공!");
            }
            
		} catch (SQLException e) {
			System.err.println("DELTE 실패");
			System.out.println(e);
			System.exit(0);
		}
	}
	
	
	public static void main(String[] args) {
		
		DML_EX db = new DML_EX();
		
		db.getDBConnection();
		
		// 각 인덱스에 객체로 저장되어있는 데이터를 toString메서드로 출력
		System.out.println("전체 데이터 출력");
		for (EmployeeDTO e:db.showAllList()) {
			System.out.println(e.toString());
		}
		
		System.out.println();
		System.out.println("검색해서 출력");
		int deptNo = 10;	// 조회할 부서번호
		System.out.println("부서번호 : " + deptNo + " 검색");
		for (EmployeeDTO e:db.showSearchList(deptNo)) {
			System.out.println(e.toString());
		}
		
		System.out.println();
//		 System.out.println("데이터 입력하기");
//		 db.insertEmployee(7856, "CHERK","CLERK", 7902, "1988-02-15", 2000, 100, 10);
		
		System.out.println();
//		System.out.println("데이터 수정하기");
//		db.updateEmployee(7856, "CLERK", 2200, 300);
		
		System.out.println();
//		System.out.println("데이터 삭제하기");
//		db.deleteEmployee(7856);

	}

}
