package db;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTypeTest {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년-MM월-DD일");
		
		Date date = new Date(2021-1900,10,18);
		
		
		Date nowDate = new Date();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
		System.out.println(simpleDateFormat.format(nowDate));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(simpleDateFormat.format(nowDate));
		System.out.println(simpleDateFormat.format(date));
		
		simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(simpleDateFormat.format(nowDate));
		System.out.println(simpleDateFormat.format(date));
		
		simpleDateFormat = new SimpleDateFormat("오늘은 E요일 입니다.");
		System.out.println(simpleDateFormat.format(nowDate));
		System.out.println(simpleDateFormat.format(date));

	}

}
