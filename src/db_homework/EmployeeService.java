package db_homework;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
	JDBCUtil jdbc = new JDBCUtil();
	Connection conn = jdbc.getDBConnection();
	
	// 전체 목록 조회
	public List<EmployeeDTO> selectAllList() {
		EmployeeDAO emp = new EmployeeDAO();
		List<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
		list = emp.showAllList(conn);
		
		return list;
	}
	
	// 목록 검색 조회 (부서번호로 조회 - 직원번호는 중복이안되기 때문에 항상 하나만 조회되서 부서번호로 조회)
	public List<EmployeeDTO> selecPartList(int deptNo) {
		EmployeeDAO emp = new EmployeeDAO();
		List<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
		list = emp.showSearchList(conn, deptNo);
		
		return list;
	}
	
	// 입력 (전체 입력 - Sequence사용 X)
	public void insertEmpData(int empNo,String eName,String job,int mgr,String h_date,int sal,int comm, int deptNo) {
		EmployeeDAO emp = new EmployeeDAO();
		
		emp.insertEmployee(conn, empNo, eName, job, mgr, h_date, sal, comm, deptNo);
	}
	
	// 수정 (empNo-직원번호로 조회해서 수정)
	public void updateEmpData(int empNo,String job,int sal,int comm) {
		EmployeeDAO emp = new EmployeeDAO();
		
		emp.updateEmployee(conn, empNo, job, sal, comm);
	}
	
	// 삭제 (empNo-직원번호로 조회해서 삭제)
	public void deleteEmpData(int empNo) {
		EmployeeDAO emp = new EmployeeDAO();
		
		emp.deleteEmployee(conn, empNo);
	}
}

