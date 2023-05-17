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



// 생성자 내에서 동일클래스 내의 또 다른 생성자를 호출은 this 키워드를 이용해 호출 가능하며,  
// 반드시 첫번째 줄/가장먼저 호출 해야만 한다. (단, 상속시 super 키워드 사용시 super가 더 먼저)
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
	public Car06_p232(){
		System.out.println("기본생성자 호출!");
	}	// 기본생성자 형식
	
	// 생성자의 오버로딩
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
		this(company, 3000, 'B',  false, new Date());
	}
	
	// 생성자의 오버로딩
	public Car06_p232(int price) {
		this("그냥회사", price, 'B',  false, new Date());
	}
	
	// 생성자의 오버로딩
	public Car06_p232(String company, int price) {
		this(company, price, 'B',  false, new Date());
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
	
	// ==> 클래스 필드에서 선언된 모든 값을 출력하는 메서드를 작성하는데 사용자 마다 메서드명이 다르게 작성할 것이다.
	// 메서드명이 다르면 혼란을 야기하기 떄문에 규칙을 정해서 그 형식에 맞게 작성한다. 
	// 사용자 맘대로 작성한 코드
	public void printInfo() {
		System.out.printf("company : %s\nprice : %d\ngrade : %c\nisHybrid : %B\nproductionDay : %s\n",  company, price, grade, isHybrid, productionDay);
	}
	// 규칙에 맞게 작성된 코드 ( java.lang.toString 을 사용한다. -> 오버라이딩 )
	// --> 규칙은 리턴타입과 메서드명을 통일시키며 오버라이딩하여 사용한다. (리턴 내용은 사용자 마음)
	@Override
	public String toString() {
		return String.format("company : %s\nprice : %d\ngrade : %c\nisHybrid : %B\nproductionDay : %s\n", company, price, grade, isHybrid, productionDay);
	}
	

	// method 
	// [접근제어자] [제어자] 리턴타입 메서드명(매개변수리스트){}
	
	
	
	
	
}
