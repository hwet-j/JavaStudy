package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/* 라이브러리등록 
 * - 해당프로젝트 Build Path->add External Library -> ojdbc6.jar추가
 
 * 1.JDBC Driver등록
 * 2.연결 Connection얻기
   3.객체준비	
   4.쿼리실행
   5.자원반납
 */
public class DML_Ex2 {
	//field
	String url = "jdbc:oracle:thin:@127.0.0.1:1521/xe";
	String user = "scott";
	String password = "tiger";
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	//constructor
	
	//method
	//1.JDBC Driver등록 & 2.연결 Connection얻기
	public void getDBConnection() {
		//1.JDBC Driver등록
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("1.JDBC Driver등록");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//2.연결 Connection얻기
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("2.연결Connection얻기-성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		//1.JDBC Driver등록 & 2.연결 Connection얻기
		DML_Ex2 obj = new DML_Ex2();
		obj.getDBConnection();
		
		//3.객체준비 & 4.쿼리실행
		//목록조회->입력->목록조회->수정->상세조회->삭제
		System.out.println();
		System.out.println("--목록조회결과-----");
		//obj.getDeptList();
		
		System.out.println();
		System.out.println("--부서정보입력-----");
		obj.insertDept("개발부97","우도");
		//obj.insertDept(97,"개발부97","우도");
		
		System.out.println();
		System.out.println("--목록조회결과-----");
		obj.getDeptList();
		
		//수정-97번의 부서명은 개발부, 울릉도		System.out.println();
		System.out.println();
		//System.out.println("--수정하기-----");
		//obj.updateDept("울릉도", "개발부", 97);
		
		System.out.println();
		//System.out.println("--상세조회결과-----");
		//obj.getDept(97);
		
		//삭제
		System.out.println();
		//System.out.println("--삭제하기-----");
		//obj.deleteDept(97);
		//obj.getDeptList();
		
		//5.자원반납
		//Connection자원반납
		obj.connClose();
	}//main
	
	//삭제하기 
	public void deleteDept(int dno) {
		String sql = "delete from dept "
				   + "where deptno=?";
		//3.객체준비
		try {
			stmt = conn.prepareStatement(sql);
		} catch (SQLException e1) {
			System.out.println("객체관련 에러발생="+e1);
			e1.printStackTrace();
		}
		
		//4.쿼리실행
		try {
			stmt.setInt(1, dno);
			int cnt = stmt.executeUpdate();
			if(cnt>0) {
				System.out.println("쿼리실행성공="+cnt);
			}
		} catch (SQLException e1) {
			System.out.println("executeUpdate()실행관련 에러발생");
			e1.printStackTrace();
		}
		
		//5.자원반납
		try {
			if(stmt!=null) {stmt.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//수정하기 
	public void updateDept(String location,String name,int dno) {
		String sql = "update dept "
				+ "set loc=?, dname=? "
				+ "where deptno=?";
		//3.객체준비
		try {
			stmt = conn.prepareStatement(sql);
		} catch (SQLException e1) {
			System.out.println("객체관련 에러발생="+e1);
			e1.printStackTrace();
		}
		
		//4.쿼리실행
		try {
			stmt.setString(1,location);
			stmt.setString(2,name);
			stmt.setInt(3,dno);
			int cnt = stmt.executeUpdate();
			if(cnt>0) {
				System.out.println("쿼리실행성공="+cnt);
			}
		} catch (SQLException e1) {
			System.out.println("executeUpdate()실행관련 에러발생");
			e1.printStackTrace();
		}
		
		//5.자원반납
		try {
			if(stmt!=null) {stmt.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	//입력하기    
	public void insertDept(String dname,String loc) {
		String sql = "insert into dept(deptno,dname,loc) "
				+ "values(seq_dno.NEXTVAL,?,?)";
		
		//3.객체준비
		try {
			stmt = conn.prepareStatement(sql);
		} catch (SQLException e1) {
			System.out.println("객체관련 에러발생="+e1);
			e1.printStackTrace();
		}
		
		//4.쿼리실행
		try {
			//stmt.setInt(1,dno);
			stmt.setString(1,dname);
			stmt.setString(2,loc);
			int cnt = stmt.executeUpdate();
			if(cnt>0) {
				System.out.println("쿼리실행성공="+cnt);
			}
		} catch (SQLException e1) {
			System.out.println("executeUpdate()실행관련 에러발생");
			e1.printStackTrace();
		}
		
		//5.자원반납
		try {
			if(stmt!=null) {stmt.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//부서번호에 따른 상세조회 
	public void getDept(int dno) {
		String sql = "select deptno as dno, dname as name,loc as location "
				   + "from dept "
				   + "where deptno=?";
		//3.객체준비
		try {
			stmt = conn.prepareStatement(sql);
		} catch (SQLException e1) {
			System.out.println("객체관련 에러발생="+e1);
			e1.printStackTrace();
		}
		
		//4.쿼리실행
		try {
			stmt.setInt(1, dno);
			rs = stmt.executeQuery();
	
			System.out.println("부서번호\t\t부서명\t\t위치");
			System.out.println("-----------------------------");
			while(rs.next()) {
				int d_no = rs.getInt("dno");
				String d_name=rs.getString("name");
				String loc = rs.getString("location");
				System.out.printf("%5d\t %14s\t %13s\r\n", d_no,d_name,loc);
			}
			
		} catch (SQLException e1) {
			System.out.println("executeUpdate()실행관련 에러발생");
			e1.printStackTrace();
		}
		
		//5.자원반납
		try {
			if(rs!=null) {rs.close();}
			if(stmt!=null) {stmt.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	//목록조회
	public void getDeptList() {
		String sql = "select deptno as dno, dname as name,loc as location "
				   + "from dept";
		//3.객체준비
		try {
			stmt = conn.prepareStatement(sql);
		} catch (SQLException e1) {
			System.out.println("객체관련 에러발생="+e1);
			e1.printStackTrace();
		}
		
		//4.쿼리실행
		try {
			rs = stmt.executeQuery();
	
			System.out.println("부서번호\t\t부서명\t\t위치");
			System.out.println("-----------------------------");
			while(rs.next()) {
				int d_no = rs.getInt("dno");
				String d_name=rs.getString("name");
				String loc = rs.getString("location");
				System.out.printf("%5d\t %14s\t %13s\r\n", d_no,d_name,loc);
			}
			
		} catch (SQLException e1) {
			System.out.println("executeUpdate()실행관련 에러발생");
			e1.printStackTrace();
		}
		
		//5.자원반납
		try {
			if(rs!=null) {rs.close();}
			if(stmt!=null) {stmt.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	

	
	
	//5.Connection자원반납
	public void connClose() {
		try {
			if(conn!=null) {conn.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Connection자원반납");
	}

}








