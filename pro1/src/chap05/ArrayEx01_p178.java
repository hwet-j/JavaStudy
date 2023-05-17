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
  			     
 */
public class ArrayEx01_p178 {

	public static void main(String[] args) {
		//배열선언 및 값할당(p184)
		//타입[] 변수명 = new 타입[길이];   
		int[] arr1 = new int[3];
		System.out.println("arr1="+arr1);//[I@15db9742
		System.out.println("arr1.length="+arr1.length);//3
		System.out.println("----------");
		System.out.println();
		
		// 타입[] 변수명 = {값0,값1,값2,.. };
		int[] arr2 = {10,20,99,1234};
		System.out.println("arr2="+arr2);//[I@6d06d69c
		System.out.println("arr2.length="+arr2.length);//4
		System.out.println("arr2[0]="+arr2[0]);//10
		System.out.println("arr2[1]="+arr2[1]);//20
		System.out.println("arr2[2]="+arr2[2]);//99
		System.out.println("arr2[3]="+arr2[3]);//1234
		System.out.println("----------");
		System.out.println();
		

		
		//타입[] 변수명 = new 타입[]{값0,값1,값2,.. };
		int[] arr3 = new int[]{1,2,9,12,99};
		System.out.println("arr3="+arr3);//[I@7852e922
		System.out.println("arr3.length="+arr3.length);//5
		//for문 이용하여 값 출력하시오
		for(int i=0;i<arr3.length;i++) { //0 1 2 3 4 ~ 5 6 7<8
			System.out.println(arr3[i]);
		}
		
		//arr3배열안의 모든값에 기존값*10로 변경
		for(int i=0;i<arr3.length;i++) { 
			arr3[i] *= 10; //arr3[i]=arr3[i]*10; 
			//arr3[0]*10  //1*10  //10  /arr3[0] =10
			//arr3[1]*10  //2*10  //20  /arr3[1] =20
		}
		
		//출력
		for(int i=0;i<arr3.length;i++) { 
			System.out.println("arr3["+i+"]="+arr3[i]);
		}
		
	}
	

}










