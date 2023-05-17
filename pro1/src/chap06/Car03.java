package chap06;

public class Car03 {
	// field(필드) : data
	// [접근제어자] [제어자] 타입 필드명 [= 초기값];
	private int gas;
	
	// constructor (생성자)
	// [접근제어자] 클래스명 (매개변수 리스트) {}
	
	
	// method(메서드) : 기능,동작
	// [접근제어자] [제어자] 리턴타입 메서드명(매개변수 리스트){}
	public int getGas() {		// gas의 getter메서드
		return this.gas;
	}
	public void setGas(int gas) { 	// gas의 setter메서드
		this.gas = gas;
	}
	public void checkGas() {
		System.out.println("현재 가스량은 " + this.gas);
	}
	
	boolean isGas() {
		if (gas <= 0) {
			return false;
		} else {
			return true;
		}
	}
	
	void run() {
		while(true) {
			if (!isGas()) {
				System.out.println("gas가 없어 이동이 불가합니다. 충전해주세요.");
				//break;		==> while문의 탈출을 break문으로 while문을 나간후 코드를 종료할 수있지만
				return; 		// --> return을 사용해서 메서드(함수) 자체를 탈출할 수 있다 .
			} else {
				gas = gas-10;
				System.out.println("gas 10만큼 이동합니다. 이동후 잔여 gas = " + gas);
			}
		}
	}
	
	
	
}
