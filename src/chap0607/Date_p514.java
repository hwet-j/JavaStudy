package chap0607;

import java.text.SimpleDateFormat;
import java.util.Date;

// Date 클래스  (java.util 내 Date클래스)
public class Date_p514 {
	public static void main(String[] args) {
		// 현재 날짜, 시간 정보를 갖는 
		Date today = new Date();
		System.out.println(today);
		System.out.println(today.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strToday = sdf.format(today);
		System.out.println(strToday);
		
	}

}
