package chap05;

//p178
/*배열(Array) : 동일 타입의 데이터를 연속된 공간에 나열,
  			     각 데이터에 index를 부여해 놓은 자료구조  
  			     
*index : 0부터 1씩 증가하는 번호
사용법> 배열명[index]     => index에 해당하는 값을 가져오기=>get  			       
사용법> 배열명[index]=값; => index에 해당하는 값을 설정하기=>set
  			       
*배열선언 및 값할당
 타입[] 변수명 = new 타입[길이]; =>타입에 따라 자동초기화
 타입[] 변수명 = {값0,값1,값2,.. };
 타입[] 변수명 = new 타입[]{값0,값1,값2,.. };
 타입[] 변수명 = new 타입[길이]{값0,값1,값2,.. };=>에러발생
 =>값의 수와 길이가 달라질 수 있기 때문.
 
*배열선언
  타입[] 변수명;  또는  타입 변수명[];
  값할당  	
  변수명[인덱스번호] = 값;
 예) 변수명[0] = 값;		
 
*배열의 길이: 배열명.length      
  			     
*배열의 초기값(P183)
  정수[]:byte,short,int,long의 기본값: 0, 0L 
  실수[]:float,double의 기본값: 0.0F 0.0
 char[]의 기본값: 공백(\u0000)
 boolean[]의 기본값: false
  클래스[]의 기본값: null => 예)String[]의 기본값: null     
 */
public class ArrayEx02_p184 {

	public static void main(String[] args) {
		//배열선언 및 자동초기값(p184)
		//타입[] 변수명 = new 타입[길이];   
		int[] a1 = new int[3];		
		for(int i=0;i<a1.length;i++) { //0 1 2
			System.out.println("int배열 a1["+i+"]="+a1[i]);
		}
		System.out.println("-----");
		System.out.println();
		
		byte[] a2 = new byte[3];		
		for(int i=0;i<a2.length;i++) { //0 1 2
			System.out.println("byte배열 a2["+i+"]="+a2[i]);
		}
		System.out.println("-----");
		System.out.println();
		
		long[] a3 = new long[3];		
		for(int i=0;i<a3.length;i++) { //0 1 2
			System.out.println("long배열 a3["+i+"]="+a3[i]);
		}
		System.out.println("-----");
		System.out.println();
		
		float[] a4 = new float[3];		
		for(int i=0;i<a4.length;i++) { //0 1 2
			System.out.println("float배열 a4["+i+"]="+a4[i]);
		}
		System.out.println("-----");
		System.out.println();
		
		double[] a5 = new double[3];		
		for(int i=0;i<a5.length;i++) { //0 1 2
			System.out.println("double배열 a5["+i+"]="+a5[i]);
		}
		System.out.println("-----");
		System.out.println();
		
		boolean[] a6 = new boolean[3];		
		for(int i=0;i<a6.length;i++) { //0 1 2
			System.out.println("boolean배열 a6["+i+"]="+a6[i]);
		}
		System.out.println("-----");
		System.out.println();
		
		char[] a7 = new char[3];		
		for(int i=0;i<a7.length;i++) { //0 1 2
			System.out.println("char배열 a7["+i+"]="+a7[i]);//공백
		}
		System.out.println("-----");
		System.out.println();
		
		String[] a8 = new String[3];		
		for(int i=0;i<a8.length;i++) { //0 1 2
			System.out.println("String배열 a8["+i+"]="+a8[i]);//null
		}
		System.out.println("-----");
		System.out.println();
	}
	

}










