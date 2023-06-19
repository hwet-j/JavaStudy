package db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class FunctionEx {

	public static void main(String[] args) {
		// JDBC Driver등록 & 연결 Connection 얻기
		JDBCUtil jdbc = new JDBCUtil();
		Connection conn = jdbc.getDBConnection();
		
		// 객체준비
		CallableStatement cstmt = null;
		
		// CALL은 소문자로 입력해야한다.
		//String sql = "{? = call 함수명 (?,?,?...?)}"
		String sql = "{? = call update_sal_fc(?)}";
		try {
			cstmt = conn.prepareCall(sql);
			cstmt.registerOutParameter(1, Types.NUMERIC);
			
			cstmt.setInt(2, 7369);
			
			cstmt.execute();
			
			int result = cstmt.getInt(1);	
			System.out.println("result : " + result);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 자원반납
			if (cstmt != null) {JDBCUtil.close(cstmt);}
			if (conn != null) {JDBCUtil.close(conn);}
		}
		
		

	}

}
