package db_service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// Data Access Object : Database에 접근하여 Query실행 등을 하는 클래스
public class DepartmentDAO {
	
	// 입력하기    
	public void insertDept(Connection conn, String dname,String loc) {
		String sql = "insert into dept(deptno,dname,loc) "
				+ "values(seq_dno.NEXTVAL,?,?)";
		
		// 객체준비
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
		} catch (SQLException e1) {
			System.out.println("객체관련 에러발생="+e1);
			e1.printStackTrace();
		}
		
		// 쿼리실행
		try {
			//stmt.setInt(1,dno);
			pstmt.setString(1,dname);
			pstmt.setString(2,loc);
			int cnt = pstmt.executeUpdate();
			if(cnt>0) {
				System.out.println("쿼리실행성공="+cnt);
			}
		} catch (SQLException e1) {
			System.out.println("executeUpdate()실행관련 에러발생");
			e1.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt);
		}
	}
	
	
	//삭제하기 
	public void deleteDept(Connection conn,  int dno) {
		String sql = "delete from dept "
				   + "where deptno=?";
		// 객체준비
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
		} catch (SQLException e1) {
			System.out.println("객체관련 에러발생="+e1);
			e1.printStackTrace();
		}
		
		// 쿼리실행
		try {
			pstmt.setInt(1, dno);
			int cnt = pstmt.executeUpdate();
			if(cnt>0) {
				System.out.println("쿼리실행성공="+cnt);
			}
		} catch (SQLException e1) {
			System.out.println("executeUpdate()실행관련 에러발생");
			e1.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt);
		} 
	}
	
	
	// 수정하기 
	public void updateDept(Connection conn, String location,String name,int dno) {
		String sql = "update dept "
				+ "set loc=?, dname=? "
				+ "where deptno=?";
		// 객체준비
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
		} catch (SQLException e1) {
			System.out.println("객체관련 에러발생="+e1);
			e1.printStackTrace();
		}
		
		// 쿼리실행
		try {
			pstmt.setString(1,location);
			pstmt.setString(2,name);
			pstmt.setInt(3,dno);
			int cnt = pstmt.executeUpdate();
			if(cnt>0) {
				System.out.println("쿼리실행성공="+cnt);
			}
		} catch (SQLException e1) {
			System.out.println("executeUpdate()실행관련 에러발생");
			e1.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt);
		}
		
	}
	

	//부서번호에 따른 상세조회 
	public List<DepartmentDTO> getDept(Connection conn, int dno) {
		String sql = "select deptno as dno, dname as name,loc as location "
				   + "from dept "
				   + "where deptno=?";
		
		List<DepartmentDTO> list = new ArrayList<DepartmentDTO>();
		
		// 객체준비
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
		} catch (SQLException e1) {
			System.out.println("객체관련 에러발생="+e1);
			e1.printStackTrace();
		}
		
		// 쿼리실행
		try {
			pstmt.setInt(1, dno);
			rs = pstmt.executeQuery();
			System.out.println("-----------------------------");
			while(rs.next()) {
				DepartmentDTO data = new DepartmentDTO();
				data.setDeptNo(rs.getInt("dno"));
				data.setDName(rs.getString("name"));
				data.setLoc(rs.getString("location"));
				
				list.add(data);
			}
			
		} catch (SQLException e1) {
			System.out.println("executeUpdate()실행관련 에러발생");
			e1.printStackTrace();
		} finally {
			JDBCUtil.close(rs);
			JDBCUtil.close(pstmt);
		}
				
		return list;
	}
	
	
	//목록조회
	public List<DepartmentDTO> getDeptList(Connection conn) {
		String sql = "select deptno as dno, dname as name,loc as location "
				   + "from dept order by deptno";
		
		List<DepartmentDTO> list = new ArrayList<DepartmentDTO>();
		
		// 객체준비
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
		} catch (SQLException e1) {
			System.out.println("객체관련 에러발생="+e1);
			e1.printStackTrace();
		}
		
		// 쿼리실행
		try {
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				DepartmentDTO data = new DepartmentDTO();
				data.setDeptNo(rs.getInt("dno"));
				data.setDName(rs.getString("name"));
				data.setLoc(rs.getString("location"));
				
				list.add(data);
			}
			
		} catch (SQLException e1) {
			System.out.println("executeUpdate()실행관련 에러발생");
			e1.printStackTrace();
		} finally {
			JDBCUtil.close(rs);
			JDBCUtil.close(pstmt);
		}
		
		return list;
	}
	
	//목록조회
	public List<String> getDeptNameList(Connection conn) {
		String sql = "select dname "
				   + "from dept";
		
		List<String> list = new ArrayList<String>();
		
		// 객체준비
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
		} catch (SQLException e1) {
			System.out.println("객체관련 에러발생="+e1);
			e1.printStackTrace();
		}
		
		// 쿼리실행
		try {
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				list.add(rs.getString("dname"));
			}
			
		} catch (SQLException e1) {
			System.out.println("executeUpdate()실행관련 에러발생");
			e1.printStackTrace();
		} finally {
			JDBCUtil.close(rs);
			JDBCUtil.close(pstmt);
		}
		
		return list;
	}
	
}
