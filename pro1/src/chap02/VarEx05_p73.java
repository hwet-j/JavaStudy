package chap02;


// 기본 타입 크기
// 정수형 : byte - char -  short - int - long
// 실수형 : float - double
public class VarEx05_p73 {

	public static void main(String[] args) {
		// 자동 타입 변환
		byte byteVal = 10;
		int intVal = byteVal;	// 자동형변환
		System.out.println("intVal: " + intVal); // 10
		
		short s1 = byteVal;	// 자동형변환
		System.out.println("shortVal :"+ s1);	// 10
		
		char charVal = '가';
		intVal = charVal;
		System.out.println("가의 유니코드: " + intVal); 
		
		intVal = 50;
		long longVal = intVal;
		System.out.println("longVal :" + longVal); // 50
		
		longVal = 100;
		float floatVal = longVal;
		System.out.println("floatVal :" + floatVal);  //100.0
		
		floatVal = 100.5f;
		double doubleVal = floatVal;
		System.out.println("doubleVal :" + doubleVal);
		
	}

}
