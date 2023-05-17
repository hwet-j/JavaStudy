package chap0607;

import java.util.Date;

// 생성자 (constructor)
/* new 연산자에 의해 호출되어 객체의 초기화 담당
- 필드의 값 설정
- 메서드를 호출해 객체를 사용할 수 있도록 준비하는 역할 수행

기본 생성자(Default constructor)
- 모든 클래스는 반드시 생성자가 하나 이상 존재한다. 
- 생성자 선언을 생략하면 컴파일러는 기본생성자 자동 추가
*/
public class Car06_p232 {
	// field : data (명사적형태)
	// [접근제어자] [제어자] 타입 변수명 [= 초기값];
	private String company;
	private int price;
	private char grade; 		// 에너지 등급 (A, B.....)
	private boolean isHybrid; 	// 하이브리드인가 아닌가
	private Date productionDay;	// 생산일
	
	// constructor : 객체생성, 필드초기화 주로 사용 
	// [접근제어자] 클래스명(매개변수리스트){}
	public Car06_p232(){}
	
	public Car06_p232(String company,
	int price,
	char grade,		
	boolean isHybrid ,
	Date productionDay){
		this.company = company;
		this.price = price;
		this.grade = grade;
		this.isHybrid = isHybrid;
		this.productionDay = productionDay;
	}
	
	// 생성자의 오버로딩
	public Car06_p232(String company) {
		this.company = company;
	}
	
	// 생성자의 오버로딩
	public Car06_p232(int price) {
		this.price = price;
	}
	
	// 생성자의 오버로딩
	public Car06_p232(String company, int price) {
		this.company = company;
		this.price = price;
	}
		
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public boolean isHybrid() {
		return isHybrid;
	}
	public void setHybrid(boolean isHybrid) {
		this.isHybrid = isHybrid;
	}
	public Date getProductionDay() {
		return productionDay;
	}
	public void setProductionDay(Date productionDay) {
		this.productionDay = productionDay;
	}
	

	// method 
	// [접근제어자] [제어자] 리턴타입 메서드명(매개변수리스트){}
	
	
	
	
	
}
