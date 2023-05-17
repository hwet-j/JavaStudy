package chap05;

//향상된 for문(p197) => 배열(Array) 또는 컬렉션(collection)에서 주로 사용
/*
 for( 타입 변수명: 배열명또는컬렉션명){
 	//반복실행코드
 }
*/
public class ArrayEx03_p197 {

	public static void main(String[] args) {
		//10,20,30,40,50을 int배열 arr1에 할당한 후 출력
		//int배열 arr1에 할당된 모든 값의 총합 출력
		System.out.println("-일반 for문 배열값 출력--");
		
		int sum=0;//누적합계를 저장하기위한 변수 선언 및 초기화
		int[] arr1 = {10,20,30,40,50,99,19};
		for(int i=0; i<arr1.length; i++) {
			System.out.println(i+"번째값="+arr1[i]);
			//sum+10   //sum=10
			//sum=0+10   //누적합계sum=10
			
			//sum=sum10+20  //10+20  //sum=30 //누적합계30
			//sum=sum30+30  //30+30  //sum=60 //누적합계60
			//60+40  //누적합계100
			//100+50 //누적합계150
			//sum=sum+arr1[i];
			sum+=arr1[i];
		}
		System.out.println("총합sum="+sum); //150
		double avg = (double)sum/arr1.length; //평균=총합/수   몫=int/5
		System.out.println("평균avg="+avg);
		
		  
		System.out.println();
		System.out.println();
		System.out.println("-향상된  for문 배열값 출력--");
		for(int temp: arr1){
		 	System.out.println(temp);
		}
		
	}

}




