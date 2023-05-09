package chap0304;

public class Check01_4 {

	public static void main(String[] args) {
		// 
		System.out.println("어떤 혜택을 원하세요?");
		char grade = 'C';
		
		switch (grade) {
		case 'A': System.out.println("VVIP 혜택입니다.");
		case 'B': System.out.println("VIP 혜택입니다."); break;
		case 'C': System.out.println("우수 혜택입니다.");
		case 'D': System.out.println("일반 혜택입니다."); break;
		default: System.out.println("혜택이 없음");
		}
		System.out.println("감사합니다.");

	}

}
