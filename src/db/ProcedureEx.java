package db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class ProcedureEx {

	public static void main(String[] args) {
		// JDBC Driver등록 & 연결 Connection 얻기
		JDBCUtil jdbc = new JDBCUtil();
		Connection conn = jdbc.getDBConnection();
		
		// 객체준비
		CallableStatement cstmt = null;
		
		// CALL은 대소문자 상관없다. -> 함수 호출시에 소문자로 입력되어야 하기 떄문에 소문자로 입력하는게 나아보임
		//String sql = "{ CALL 프로시저명 (?,?,?...?)}"
		String sql = "{ CALL update_sal_proc(?,?)}";
		try {
			cstmt = conn.prepareCall(sql);
			cstmt.setInt(1, 7369);
			cstmt.setInt(2, 15);
			
			cstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 자원반납
			if (cstmt != null) {JDBCUtil.close(cstmt);}
			if (conn != null) {JDBCUtil.close(conn);}
		}
		
		

	}

}
