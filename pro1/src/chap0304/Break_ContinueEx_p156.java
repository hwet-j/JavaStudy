package chap0304;

public class Break_ContinueEx_p156 {

	public static void main(String[] args) {
		int i = 1;
		while (i < 11) {
			System.out.println(i);
			if (i == 5) {
				System.out.println("i는 5입니다.");
				break; // break가 속한 반복문을 종료한다.
			}
			i++;
		}
		System.out.println("=============");
		i = 1;
		while (i < 11) {
			if (i == 5) {
				i++;
				continue; // continue 이후의 코드를 실행하지 않고 다음 반복문으로 넘어간다.
			} 
			System.out.println(i);
			i++;
		}
	}

}
