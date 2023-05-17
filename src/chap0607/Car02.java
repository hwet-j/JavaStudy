package chap0607;

public class Car02 {
	private String color="blue";		
	String brand = "테슬라";
	private double fe = 10.6; 
	private int rpm;
	private char useAI = 'Y';
	private boolean useNav = true;
	
	private int currentSpeed = 0;
	int maxSpeed = 300;
	
	// 시동켜기
	void powerOn() {
		System.out.println("powerOn() 호출");
	}
	// 시동끄기
	void powerOff() {
		System.out.println("powerOff() 호출");
	}
	
	// 속도 높이기 
	void speedUp() {
		currentSpeed += 10;		// ==> private이지만 현재 호출되는 클래스는 동일 클래스 파일 내에서 선언되고있으므로 에러가 발생하지 않는다.
		System.out.println("가속.." + currentSpeed + "km/h");
	}
	
	// 속도 줄이기
	void speedDown() {
		currentSpeed -= 10;
		System.out.println("감속.." + currentSpeed + "km/h");
	}
	
	// 필드 값을 외부에 제공하는 getter 메서드 선언
	public String getColor() {		// 색깔
		return this.color;	// get 메서드에는 this가 생략되었다고 생각하면 된다.(중복되는 메서드가 없기때문)
	}
	public String getBrand() {		// 브랜드
		return brand;
	}
	public double getFe() {		// 연비
		return fe;
	}
	public int getRpm() {		//RPM
		return rpm;
	}
	public char getUseAI() {		// AI
		return useAI;
	}
	public boolean isUseNav() {		// 네비 유무
		return useNav;
	}
	public int getCurrentSpeed() {		// 현재속도
		return currentSpeed;
	}
	public int getMaxSpeed() {		//최고속도
		return maxSpeed;
	}
	
	// 필드 값을 외부에서 수정 가능한 setter 메서드 선언
	public void setColor(String color) {		// 색깔
		this.color = color;		// this는 동일한 객체명이 존재할 때 클래스내에서 구분짓기 위한 명령어이다.
	}
	public void setBrand(String brand) {		// 브랜드
		this.brand = brand;
	}
	public void  setFe(double fe) {		// 연비
		this.fe = fe;
	}
	public void setRpm(int rpm) {		//RPM
		this.rpm = rpm;
	}
	public void setUseAI(char useAI) {		// AI
		this.useAI = useAI;
	}
	public void setisUseNav(boolean useNav) {		// 네비 유무
		this.useNav = useNav;
	}
	public void setCurrentSpeed(int currentSpeed) {		// 현재속도
		this.currentSpeed = currentSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {		//최고속도
		this.maxSpeed = maxSpeed;
	}
	
	
	
}
