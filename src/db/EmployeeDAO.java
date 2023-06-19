package db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	// 목록 조회 
	public List<EmployeeDTO> showAllList(Connection conn){
		Statement stmt = null;
		ResultSet rs  = null;
		
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
		} finally {
			JDBCUtil.close(rs);
			JDBCUtil.close(stmt);
		}
		
		return list;
	}
	
	// 상세 조회 -> 부서 번호로 검색
	public List<EmployeeDTO> showSearchList(Connection conn, int deptNo){
		PreparedStatement pstmt = null;
		ResultSet rs  = null;
		// 직원목록 WHERE절 검색
		String sql = "SELECT * FROM emp Where DEPTNO = ?";
		
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
		} finally {
			JDBCUtil.close(rs);
			JDBCUtil.close(pstmt);
		}
		
		return list;
	}
	
	// 입력하기 -> 전체 입력
	public void insertEmployee(Connection conn, int empNO, String eName, String job, int mgr,
			String h_date, int sal, int comm, int deptNo) {
		
		PreparedStatement pstmt = null;
		ResultSet rs  = null;
		
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
            
            if(result>0) { 
                System.out.println("데이터 삽입 성공!");
            }
            
		} catch (SQLException e) {
			System.err.println("INSERT 실패");
			System.out.println(e);
			System.exit(0);
		} finally {
			JDBCUtil.close(rs);
			JDBCUtil.close(pstmt);
		}
	}
	
	// 수정하기 -> 직원번호
	public void updateEmployee(Connection conn, int empNO,  String job, int sal, int comm) {
		String sql = "UPDATE emp SET job = ?, sal = ?, comm =? WHERE EMPNO = ?";
		
		PreparedStatement pstmt = null;
		
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
		} finally {
		    JDBCUtil.close(pstmt);
		}
	}
		
	
	// 삭제하기  -> 직원번호
	public void deleteEmployee(Connection conn, int empNO) {
		String sql = "DELETE FROM emp WHERE EMPNO = ?";
		
		PreparedStatement pstmt = null;
		
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
		} finally {
			JDBCUtil.close(pstmt);
		}
	}
}
