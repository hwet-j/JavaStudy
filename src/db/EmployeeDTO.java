package db;

import java.sql.Date;

public class EmployeeDTO {
	private int EMPNO;
	private String ENAME;
	private String JOB;
	private int MGR;
	private Date HIREDATE;
	private int SAL;
	private int COMM;
	private int DEPTNO;
	
	public EmployeeDTO() {}
	
	public EmployeeDTO(int eMPNO, String eNAME, String jOB, int mGR, Date hIREDATE, int sAL, int cOMM, int dEPTNO) {
		super();
		EMPNO = eMPNO;
		ENAME = eNAME;
		JOB = jOB;
		MGR = mGR;
		HIREDATE = hIREDATE;
		SAL = sAL;
		COMM = cOMM;
		DEPTNO = dEPTNO;
	}

	public int getEMPNO() {
		return EMPNO;
	}

	public void setEMPNO(int eMPNO) {
		EMPNO = eMPNO;
	}

	public String getENAME() {
		return ENAME;
	}

	public void setENAME(String eNAME) {
		ENAME = eNAME;
	}

	public String getJOB() {
		return JOB;
	}

	public void setJOB(String jOB) {
		JOB = jOB;
	}

	public int getMGR() {
		return MGR;
	}

	public void setMGR(int mGR) {
		MGR = mGR;
	}

	public Date getHIREDATE() {
		return HIREDATE;
	}

	public void setHIREDATE(Date hIREDATE) {
		HIREDATE = hIREDATE;
	}

	public int getSAL() {
		return SAL;
	}

	public void setSAL(int sAL) {
		SAL = sAL;
	}

	public int getCOMM() {
		return COMM;
	}

	public void setCOMM(int cOMM) {
		COMM = cOMM;
	}

	public int getDEPTNO() {
		return DEPTNO;
	}

	public void setDEPTNO(int dEPTNO) {
		DEPTNO = dEPTNO;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [EMPNO=" + EMPNO + ", ENAME=" + ENAME + ", JOB=" + JOB + ", MGR=" + MGR + ", HIREDATE="
				+ HIREDATE + ", SAL=" + SAL + ", COMM=" + COMM + ", DEPTNO=" + DEPTNO + "]";
	}
	
	

}
