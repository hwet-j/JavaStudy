import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
		
		Date myDate = date1.parse("2021-02-03");
		
		System.out.println(myDate);
		
		System.out.println("TO_DATE('1981-06-09', 'yyyy-mm-dd')");
		
	}
	
}
