package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertEx2 {
public static void main(String[] args) {
		
		//드라이버 검색 (db와 연동 준비)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 검색 성공");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 검색 실패");
			System.exit(0);
		}
		
		//데이터베이스 연결 - 커넥션 만들기 
		Connection conn = null;
		
		// 쿼리문 준비 - 작은따옴표,세미콜론 사용 X
        String sql = "INSERT INTO dept VALUES(?,?,?)";
        
        PreparedStatement pstmt = null;
        
		try {
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe"
					,"scott", "tiger");
			System.out.println("데이터베이스 연결 성공");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 95);
			pstmt.setString(2, "부서명1");
			pstmt.setString(3, "지역1");
			
			// Scanner로 입력받아 작성해보기
			/*
			 * Scanner sc = new Scanner(System.in); System.out.print("부서번호 입력 : ");
			 * pstmt.setInt(1, sc.nextInt()); System.out.print("부서명 입력 : ");
			 * pstmt.setString(2, sc.next()); System.out.print("부서위치 입력 : ");
			 * pstmt.setString(3, sc.next());
			 */
            int result = pstmt.executeUpdate();
            
            if(result>0) {	// result가 1이상이면 하나는 작업했다는 의미 
                System.out.println("데이터 삽입 성공!");
            }
            
			// DB 자원 반납
			
		} catch (SQLException e) {
			System.err.println("데이터베이스 연결 또는 INSERT 실패");
			System.out.println(e);
			System.exit(0);
		}
		
		// DB 자원 반납
		try {
			if(pstmt != null) {pstmt.close();}
			if(conn != null) {conn.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}