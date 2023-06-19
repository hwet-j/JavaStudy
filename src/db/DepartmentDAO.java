package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
		}
		
		JDBCUtil.close(pstmt);
		
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
		}
		
		JDBCUtil.close(pstmt);
		
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
		}
		
		JDBCUtil.close(pstmt);
		
	}
	

	//부서번호에 따른 상세조회 
	public void getDept(Connection conn, int dno) {
		String sql = "select deptno as dno, dname as name,loc as location "
				   + "from dept "
				   + "where deptno=?";
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
		
		JDBCUtil.close(pstmt);
		
	}
	
	
	//목록조회
	public void getDeptList(Connection conn) {
		String sql = "select deptno as dno, dname as name,loc as location "
				   + "from dept order by deptno";
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
		
		JDBCUtil.close(pstmt);

	}
}
