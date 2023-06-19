package chap10;

import java.text.DecimalFormat;

/*
NumberFormatException : 문자열의 데이터를 숫자로 변경하는 경우
숫자로 변경할 수 없는 문자가 포함되어 있을 때 발생
*/
public class NumberFormatException_p449 {

	public static void main(String[] args) {
		String strV1 = "1234";
		String strV2 = "1234숫자";
		String strV3 = "1234.9";
		String strV4 = "-1234.9";
		String strV5 = "951,555,666";
		
		int v1 = Integer.parseInt(strV1);
		//int v2 = Integer.parseInt(strV2);			// 컴파일 에러 발생 X, 실행 에러
		// java.lang.NumberFormatException
		// int v3 = Integer.parseInt(strV3);		// Integer 형식이 아니므로 불가능 - NumberFormatException 
		double v3 = Double.parseDouble(strV3);
		double v4 = Double.parseDouble(strV4);
		float v5 = Float.parseFloat(strV4);
		// double v6 = Double.parseDouble(strV5);	// NumberFormatException
		// float v7 = Float.parseFloat(strV5);		// NumberFormatException
		// int v8 = Integer.parseInt(strV5);		// NumberFormatException
		
		
		System.out.println(v1);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		
		System.out.println("=================\nDecimalFormat - 숫자형 데이터를 다양한 형식으로 출력할 수 있다.");
		// DecimalFormat - 숫자형 데이터를 형식을 작성하여 String형으로 리턴해준다.
		DecimalFormat df = new DecimalFormat("#.000000000");	// 패턴 작성
		DecimalFormat df2 = new DecimalFormat("##,##");	
		DecimalFormat df3 = new DecimalFormat("#,###,###");	
		DecimalFormat df4 = new DecimalFormat("#,###,###.0000");	
		DecimalFormat df5 = new DecimalFormat("#,##.00");	
		long v9 = 12331314151l;
		
		System.out.println(df.format(v3));
		System.out.println(df2.format(v9));
		System.out.println(df3.format(v9));
		System.out.println(df4.format(v9));
		System.out.println(df5.format(v9));
		
		
		
		
		
	}

}
