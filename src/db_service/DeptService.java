package db_service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;


// Main -> Service -> DAO -> DB 
public class DeptService {
	// 모든 부서 조회
	public List<DepartmentDTO> detpAllList(){
		List<DepartmentDTO> list = new ArrayList<DepartmentDTO>();
		
		JDBCUtil jdbc = new JDBCUtil();
		Connection conn = jdbc.getDBConnection();
		DepartmentDAO deptDao = new DepartmentDAO();
		
		list = deptDao.getDeptList(conn);
		
		JDBCUtil.close(conn);
		return list;
	}
	// 부서번호 조회
	public List<DepartmentDTO> detpPartList(int dno){
		List<DepartmentDTO> list = new ArrayList<DepartmentDTO>();
		
		JDBCUtil jdbc = new JDBCUtil();
		Connection conn = jdbc.getDBConnection();
		DepartmentDAO deptDao = new DepartmentDAO();
		
		list = deptDao.getDept(conn, dno);
		
		JDBCUtil.close(conn);
		return list;
	}
	
	// 삭제 (부서번호)
	public void deleteDept(int dno) {
		JDBCUtil jdbc = new JDBCUtil();
		Connection conn = jdbc.getDBConnection();
		DepartmentDAO deptDao = new DepartmentDAO();
		
		deptDao.deleteDept(conn, dno);
		
		JDBCUtil.close(conn);
	}
	
	// 부서명 조회
	public List<String> deptNameList() {
		JDBCUtil jdbc = new JDBCUtil();
		Connection conn = jdbc.getDBConnection();
		
		
		DepartmentDAO deptDao = new DepartmentDAO();
		
		List<String> list = deptDao.getDeptNameList(conn);
		
		JDBCUtil.close(conn);
		
		return list;
	}
	
	// 입력
	public void insertDept(String dname, String loc) {
		JDBCUtil jdbc = new JDBCUtil();
		Connection conn = jdbc.getDBConnection();
		
		
		DepartmentDAO deptDao = new DepartmentDAO();
		deptDao.insertDept(conn, dname, loc);
		
		JDBCUtil.close(conn);
	}
	// 수정 - where deptno
	public void updateDept(String location, String name, int dno) {
		JDBCUtil jdbc = new JDBCUtil();
		Connection conn = jdbc.getDBConnection();
		
		
		DepartmentDAO deptDao = new DepartmentDAO();
		deptDao.updateDept(conn, location, name, dno);
		
		JDBCUtil.close(conn);
	}
	
}

