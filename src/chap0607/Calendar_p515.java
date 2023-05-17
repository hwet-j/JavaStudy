package chap0607;

import java.util.Calendar;

// Calendar 클래스 : 추상클래스이므로 new연산자를 사용 X
public class Calendar_p515 {
	public static void main(String[] args) {
		// Calendar now = new Calendar();		// 추상클래스로 new 연산자 사용 불가
		Calendar now = Calendar.getInstance();
		// System.out.println(now);
		
		int year = now.get(1);
		System.out.println(year);
		year = now.get(Calendar.YEAR);
		System.out.println(year);
		int month = now.get(Calendar.MONTH)+1;	// 월 정보를 가져오지만 0~11의 범위값을 가지고있다. - 1월이 0을 리턴 (+1을 해줘야 알맞은 월 파악가능)
		System.out.println(month);		
		int day = now.get(Calendar.DATE);
		System.out.println(day);
		int hour = now.get(Calendar.HOUR);
		int hour24 = now.get(Calendar.HOUR_OF_DAY);
		int min = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		int week = now.get(Calendar.DAY_OF_WEEK); // 1(일) ~ 7(토)
		
		System.out.print("현재시각 : ");
		System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초 \n", year, month, day, hour, min, second);
		
		
		
	}
}
