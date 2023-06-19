package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateEx2 {
	public static void main(String[] args) {
		// 데이터베이스 정보
		String url = "jdbc:oracle:thin:@127.0.0.1:1521/xe";
		String user_id = "scott";
		String user_pw = "tiger";
		
		// 객체준비/데이터베이스 연결
		Connection conn = null;
			
		// 객체준비/쿼리실행
		PreparedStatement pstmt = null;
		
		//드라이버 검색 (db와 연동 준비)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 검색 성공");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 검색 실패");
			System.exit(0);
		}
		
		try {
			// 데이터베이스 연결
			conn = DriverManager.getConnection(url, user_id, user_pw);
					
			System.out.println("데이터베이스 연결 성공");
			
			// SQL문
			String sql = "UPDATE dept SET dname=?, loc=? where deptno = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 95);
			pstmt.setString(2, "부서명1");
			pstmt.setString(3, "지역1");
			
			int cnt = pstmt.executeUpdate();
			
			System.out.println(cnt+"개 데이터 UPDATE!");
			
		} catch (SQLException e) {
			System.err.println("데이터베이스 연결 또는 UPDATE 실패");
			System.out.println(e);
			System.exit(0);		// main실행 종료
		}
		
		// 자원 반납
		try {
			if(pstmt != null) {pstmt.close();}
			if(conn != null) {conn.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}