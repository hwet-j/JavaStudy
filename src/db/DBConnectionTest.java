package db;

import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DB Connention 테스트용 클래스이다.

/*
라이브러리등록 - 해당 프로젝트 Build Path -> add External Library -> Jar파일 선택

1. JDBC Driver 등록
2. 연결 Connection 얻기
3. 객체준비
4. 쿼리실행
5. 자원반납


*/

public class DBConnectionTest {

	public static void main(String[] args) {
		// 1. JDBC Driver 등록
		try {
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 검색 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패");
			e.printStackTrace();
		}
		
		// jdbc:subprotocol:subname
		// @는 ~에 라는 의미 (localhost에), 포트번호는 초기 설치시 설정한 포트번호(Listener Port)
		String url = "jdbc:oracle:thin:@127.0.0.1:1521/xe";
		// String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user_id = "ora_user";
		String user_pw = "hong";
		
		// 2. 연결 Connection 얻기
		Connection conn=null;
		try {
			conn = DriverManager.getConnection(url, user_id, user_pw);
			System.out.println("데이터베이스 연결(Connection) 성공");
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 실패");
			e.printStackTrace();
		}
		
		try {
			if(conn!=null) {conn.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		
	}

}
