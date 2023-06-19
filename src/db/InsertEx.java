package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertEx {
	public static void main(String[] args) {
		// 데이터베이스 정보
		String url = "jdbc:oracle:thin:@127.0.0.1:1521/xe";
		String user_id = "scott";
		String user_pw = "tiger";
		
		// 객체준비/데이터베이스 연결
		Connection conn = null;
			
		// 객체준비/쿼리실행
		Statement stmt = null;
		
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
			
			// SQL문 작성 - 세미콜론 작성 X
			String sql = "INSERT INTO dept VALUES(96, '개발부2', '우도')";
			
			String input1 = "94";
			String input2 = "부서1";
			String input3 = "인천";
			
			String sql2 = "INSERT INTO dept VALUES(" + input1 + 
					", '" + input2 + "', '" + input3 + "')";
			
			// SQL문을 실행시키기 위한 Statement객체 얻어오기
			stmt = conn.createStatement();
			//System.out.println("Statement객체 얻어오기 성공");
			
			// Statement의 execute(String sql)메서드를 사용하여 sql문 실행
			// stmt.execute(sql);
			
			// Statement의 executeUpdate(String sql)메서드를 사용하여 sql문 실행 : insert, update, delete 실행시 사용되며, 실행된 row를 반환, 0이반환되면 쿼리실행 안됨
			int cnt = stmt.executeUpdate(sql2);// stmt는 실행이 되었다면 성공한 row 개수만큼 리턴값을 가진다.
			
			// ORACLE은 AUTO COMMIT -> 다른 메서드는 다를 수도 있음 
			// sql창에서 commit작업을 진행을 안하고 하면 문제가 발생하기도함.
			
			// System.out.println("데이터 INSERT!");
			System.out.println(cnt+"개 데이터 INSERT!");
			
		} catch (SQLException e) {
			System.err.println("데이터베이스 연결 또는 INSERT 실패");
			System.out.println(e);
			System.exit(0);		// main실행 종료
		}
		
		// 자원 반납
		try {
			if(stmt != null) {stmt.close();}
			if(conn != null) {conn.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}