package db;

import java.sql.Connection;

public class DBMain2 {

	public static void main(String[] args) {
		JDBCUtil jdbc = new JDBCUtil();
		Connection conn = jdbc.getDBConnection();
		
		EmployeeDAO empDao = new EmployeeDAO();
		
		for (EmployeeDTO dto:empDao.showAllList(conn)) {
			System.out.println(dto.toString());
		}

	}

}

/*
직원 테이블에서 사용할 sequence 생성 명령어

CREATE SEQUENCE emp_seq
START WITH 9001
INCREMENT BY 1
MINVALUE 1
MAXVALUE 9999
NOCYCLE
CACHE 20;

INSERT INTO emp VALUES (emp_seq.NEXTVAL, ?,?,?,?,?,?,?);


*/