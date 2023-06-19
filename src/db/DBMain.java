package db;

import java.sql.Connection;

public class DBMain {

	public static void main(String[] args) {
		// JDBC Driver등록 & 연결 Connection 얻기
		JDBCUtil jdbc = new JDBCUtil();
		Connection conn = jdbc.getDBConnection();
		
		// 객체 준비 & 쿼리 실행
		DepartmentDAO deptDao = new DepartmentDAO();
		
		
		// 입력 
		// deptDao.insertDept(conn, "부서2", "제주도");
		
		// 수정
		// deptDao.updateDept(conn, "신도림", "디자인", 54);
		
		// 조회
		deptDao.getDeptList(conn);
		
		// 삭제 
		//deptDao.deleteDept(conn, 52);
		
		// 조회
		// deptDao.getDeptList(conn);
		
		// 상세조회
		// System.out.println();
		// deptDao.getDept(conn, 20);
		
		// DTO 사용 
		DepartmentDAO2 deptDao2 = new DepartmentDAO2();

		// 전체조회
		for(DepartmentDTO item :deptDao2.getDeptList(conn)) {
			System.out.println(item.toString());
		}
		
		/*
		 * System.out.println("get메서드로 출력"); for(DepartmentDTO item
		 * :deptDao2.getDeptList(conn)) { System.out.println(item.getDeptNo());
		 * System.out.println(item.getDName()); System.out.println(item.getLoc()); }
		 */
		
		// 상세조회
		for(DepartmentDTO item :deptDao2.getDept(conn, 85)) {
			System.out.println(item.toString());
		}
		
		// 자원반납
		// jdbc.close(conn)으로 호출 가능하지만, close는 static메서드로 클래스명으로 직접호출을 권장한다.
		JDBCUtil.close(conn);	
		
	}

}
