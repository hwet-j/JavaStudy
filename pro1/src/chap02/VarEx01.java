package chap02;


// 변수(Variable) 교재 p.53
public class VarEx01 {
	public static void main(String[] args) {
		int hour = 3; 		// 변수 선언 및 초기값 설정 ( 데이터타입 변수명 = 초기값; )
		int minute = 5; 
		System.out.println(hour + "시간 " + minute + "분");
		// 숫자형(int)과 문자열의 + 연산을 하면 모두 문자열?
		
		int totalMinute = (hour * 60) + minute;
		System.out.println("총 " + totalMinute + "분");
		System.out.println("==================");
		
		String hour2 = "5시";
		String minute2 = "30분";
		System.out.println(hour2);
		System.out.println(hour2 + minute2);
		System.out.println(hour2 + " " +  minute2);
//		System.out.print(hour2);System.out.print(" ");System.out.print(minute2);
		
		// 선언과 초기값 설정 따로
		String hour3;
		hour3 = "초기값 따로설정";
		System.out.println(hour3);
		
		
	}
}

// + : 문자열 연결 연산자 
