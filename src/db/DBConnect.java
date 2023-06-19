package db;
// DB연결하는 클래스

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnect {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public DBConnect() {

		final String url = "jdbc:oracle:thin:@localhost:xe";
		final String id = "ora_user"; // DB사용자계정
		final String pw = "hong"; // PASSWORD

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
