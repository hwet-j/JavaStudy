package chap05;

import java.util.Arrays;

// 배열 복사
public class ArraysEx06_p195 {

	public static void main(String[] args) {
		int[] oriArr = new int[] {11,12,13,14,15};
		System.out.println("oriArr = " + oriArr);
		System.out.println(Arrays.toString(oriArr));
		
		// 원본 배열의 2배길이인 새로운 배열 선언
		int[] copyArr = new int[oriArr.length * 2];
		int[] copyArr2 = new int[oriArr.length * 2];
		int[] copyArr3 = new int[2];
		System.out.println(Arrays.toString(copyArr));// --> 확인 
		// 값 대입
		for (int i=0;i<copyArr.length;i++) {
			copyArr[i] = oriArr[i/2];
		}
		System.out.println(Arrays.toString(copyArr));// --> 확인 

		// 배열 복사 ===>   새배열명 = 원본배열명
		copyArr2 = oriArr;
		System.out.println(Arrays.toString(copyArr2));// --> 확인 
		// 길이가 줄어듦
		
		copyArr3 = oriArr;
		System.out.println(Arrays.toString(copyArr3));// --> 확인 
		// 길이가 늘어남
		// ==> 이전 배열의 길이와 상관없이 해당 변수명에 원본배열의 주소값을 가져온다. 
		oriArr[0] = 11234;
		System.out.println(Arrays.toString(oriArr));
		System.out.println(Arrays.toString(copyArr3)); 
		// 원본주소값을 가져갔기 때문에 원본배열의 요소만 변경해도 복사된  copyArr3의 요소도 같이 변경된다.
		// 요소를 복사했다고 이해하면 안됨. 주소를 복사한 것임.
		System.out.println();
		
		oriArr[0] = 11;
		int[] copyArr4 = new int[2];
		// 2) Object.clone(); 이용 (Object클래스의 clone() 메소드 이용)
		System.out.println("Object.clone() => 깊은 복사");
		copyArr4 = oriArr.clone();
		System.out.println(Arrays.toString(copyArr4)); 
		oriArr[0] = 615;
		System.out.println("원본배열 수정하여 복사 종류 확인"); 
		System.out.println("원본배열" + Arrays.toString(oriArr)); 
		System.out.println("복사배열" + Arrays.toString(copyArr4)); 
		System.out.println("깊은 복사."); 
		System.out.println();
		
		oriArr[0] = 11;
		int[] copyArr5 = new int[2];
		//3) Arrays.copyof(); 이용
		System.out.println("Arrays.copyOf() => 깊은 복사");
		copyArr5 = Arrays.copyOf(oriArr, oriArr.length);  // 뒤에 매개변수는 새로운 배열의 길이설정.
		System.out.println(Arrays.toString(copyArr5)); 
		oriArr[0] = 615;
		System.out.println("원본배열 수정하여 복사 종류 확인"); 
		System.out.println("원본배열" + Arrays.toString(oriArr)); 
		System.out.println("복사배열" + Arrays.toString(copyArr5)); 
		System.out.println("깊은 복사."); 
		System.out.println();
		
		oriArr[0] = 11;
		int[] copyArr6 = new int[2];
		// 4) Arrays.copyOfRange();
		System.out.println("Arrays.copyOfRange() => 깊은 복사");
		copyArr6 = Arrays.copyOfRange(oriArr, 1, oriArr.length);  
		//  매개변수 (원본배열, 복사할원본배열처음index,  마지막 index) ==> 마지막 index의 전까지 복사됨 (첫index이상 마지막index미만으로 생각)
		// ==> 마지막 인덱스의 설정이 원본배열보다 큰경우에는 복사가능한 위치까지 복사 후 나머지는 길이에 맞게 기본형으로 설정된다. 
		System.out.println(Arrays.toString(copyArr6)); 
		oriArr[0] = 615;
		System.out.println("원본배열 수정하여 복사 종류 확인"); 
		System.out.println("원본배열" + Arrays.toString(oriArr)); 
		System.out.println("복사배열" + Arrays.toString(copyArr6)); 
		System.out.println("깊은 복사."); 
		System.out.println();
		
		oriArr[0] = 11;
		int[] copyArr7 = new int[10];
		// 5) System.arraycopy()
		System.out.println("System.arraycopy(원본배열, 원본배열시작인덱스, 새배열, 새배열시작인덱스, 복사할 개수"); // 깊은 복사
		System.arraycopy(oriArr, 2, copyArr7, 0, 3);
		System.out.println(Arrays.toString(copyArr7)); 
		oriArr[0] = 615;
		System.out.println("원본배열 수정하여 복사 종류 확인"); 
		System.out.println("원본배열" + Arrays.toString(oriArr)); 
		System.out.println("복사배열" + Arrays.toString(copyArr7)); 
		System.out.println("깊은 복사."); 
		System.out.println();
		
		
	}

}
