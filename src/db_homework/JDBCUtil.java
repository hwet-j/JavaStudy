package db_homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521/xe";
	private String id = "scott"; // DB사용자계정
	private String pw = "tiger"; // PASSWORD

	// JDBC Driver등록, Connection 얻기
	public Connection getDBConnection() {
		Connection conn = null;

		// JDBC Driver 등록
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			// System.out.println("드라이버 검색 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패");
			e.printStackTrace();
		}

		// 연결 Connection 얻기
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			// System.out.println("Connection 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}

	// 자원 반납 -> 메서드명을 close로 각 자원을 오버로딩
	// Connection
	public static void close(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Statement (PreparedStatement관련 close가 없다면 해당 메서드에서 작업진행됨)
	public static void close(Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// PreparedStatement -> Statement객체를 반환하는 메서드가 존재한다면 이 메서드는 꼭 작성할 필요는 없다.
	// PreparedStatement가 Statement를 상속받고 있으므로 매개변수가 타입이 Statement여도
	// PrepareStatement가
	// 객체로 들어가도 다형성에 의해 자동형변환이 일어나기 때문이다.
	public static void close(PreparedStatement pstmt) {
		try {
			if (pstmt != null) {
				pstmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// ResultSet
	public static void close(ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
