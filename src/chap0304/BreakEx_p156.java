package chap0304;

public class BreakEx_p156 {

	public static void main(String[] args) {
		int i =1;
		while (i<11) {
			System.out.println(i);
			if(i==5) {
				System.out.println("i는 5입니다.");
				break;
			}
			i++;
		}
		

	}

}
