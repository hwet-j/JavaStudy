package chap13;

public class Student {
	private int stuNo;			// 번호
	private String stuName;		// 이름
	private String stuSex;		// 성별
	private String stuMajor;	// 전공
	// private int stuScore;	// 점수
	
	public Student() {
		// 기본생성자
	}
	
	public Student(int stuNo, String stuName, String stuSex, String stuMajor) {
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuMajor = stuMajor;
	}
	
	@Override
	public String toString() {
		return "[stuNo=" + this.stuNo + "][stuName=" + this.stuName + "][stuSex=" + this.stuSex + "][stuMajor=" + this.stuMajor + "]"; 
	}
	
	/*
	 * 동등 객체라면 같은 키로 간주하고 중복 저장되지 않도록 하기위해 
	 * hashCode()의 리턴값이 같고 equals() 메서드가 true이면
	 * 동등한 객체로 처리한다.
	 * ==> 동등한 객체가 되려면 hashcode, equals 둘다 같아야함
	 */
	
	@Override
	public int hashCode() {
		return this.stuNo;
	}
	
	
	
	// 자신과 비교객체가 동일하면 true 리턴, 그렇지않으면 false
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Student) { // && 연산자는 앞에서 false가 나오면 뒤에는 확인하지 않는다.
			// if 문을 이중으로 작성한 이유는 obj에 아무런 정보가 오지않으면 에러가 발생하기 때문에 이를 방지하고자 null이면 넘어간다.
			Student student = (Student)obj;	// if문에서 형변환 가능한지 확인했기 때문에 강제형변환
			
			return this.stuNo == student.stuNo;		// 객체 자신의 번호와 매개변수에 담긴 번호를 비교
		} else {
			return false;
		}
	}
	

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
	this.stuName = stuName;
	}

	public String getStuSex() {
		return stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	public String getStuMajor() {
		return stuMajor;
	}

	public void setStuMajor(String stuMajor) {
		this.stuMajor = stuMajor;
	}
	 


	
	
	
}
