package db_service;

public class DepartmentDTO {
	private int deptNo;		// 부서번호
	private String dName;	// 부서명
	private String loc;		// 부서위치
	
	public int getDeptNo() {
		return deptNo;
	}
	public String getDName() {
		return dName;
	}
	public String getLoc() {
		return loc;
	}
	
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public void setDName(String dName) {
		this.dName = dName;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "DepartmentDTO [deptNo=" + deptNo + ", dName=" + dName + ", loc=" + loc + "]";
	}
	
	
	
	
	
}
