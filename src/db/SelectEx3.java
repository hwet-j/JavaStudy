package db;


// SELECT문 별칭 사용
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectEx3 {
	public static void main(String[] args) {
		// 데이터베이스 정보
		String url = "jdbc:oracle:thin:@127.0.0.1:1521/xe";
		String user_id = "scott";
		String user_pw = "tiger";
		
		// 객체준비/데이터베이스 연결
		Connection conn = null;
			
		// 객체준비/쿼리실행
		Statement stmt = null;
		
		ResultSet rs = null;
		
		// 드라이버 검색 (db와 연동 준비)
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
			// String sql = "SELECT deptno 부서번호, dname 부서명, loc as 위치 FROM dept";
			// 부서 번호 93 미만 데이터만 출력
			String sql = "SELECT * FROM dept";
			
			
			// SQL문을 실행시키기 위한 Statement객체 얻어오기
			stmt = conn.createStatement();
			
			// boolean resultSet = stmt.execute(sql);	// sql 실행문이며 리턴값은 실행되었는가 안되었는가 boolean형을 리턴한다.
			
			rs = stmt.executeQuery(sql);
			System.out.println("부서번호\t부서이름\t부서위치");
			while(rs.next()) {
				// 별칭을 사용하여 출력가능
				System.out.print(rs.getInt("부서번호") + "\t" + rs.getString("부서명") + "\t" + rs.getString("위치") + "\n");
				// 바뀌기 전 칼럼명은 사용 불가능 하다.
				// System.out.print(rs.getInt("deptno") + "\t" + rs.getString("dname") + "\t" + rs.getString("loc") + "\n");
			}
			
		} catch (SQLException e) {
			System.err.println("데이터베이스 연결 또는 실행 실패");
			System.out.println(e);
			System.exit(0);		// main실행 종료
		}
		
		// 자원 반납
		try {
			if(rs != null) {rs.close();}
			if(stmt != null) {stmt.close();}
			if(conn != null) {conn.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
