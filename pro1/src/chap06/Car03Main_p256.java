package chap06;

// 
public class Car03Main_p256 {
	public static void main(String[] args) {
		Car03 myCar = new Car03();
		// 가스 확인
		System.out.println("초기gas = " + myCar.getGas());
		
		// 가스 수정(가스 충전)
		System.out.println(myCar.isGas());
		myCar.setGas(100);
		myCar.checkGas();
		
		// 가스 확인 (가스가 존재하면 출발가능합니다., 존재하지 않으면 gas를 주입하세요. 출력)
		System.out.println(myCar.isGas());
		if (myCar.isGas()) {
			System.out.println("출발합니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
		
		myCar.run();
		
	}
}
