package chap0304;

public class Check02_6 {

	public static void main(String[] args) {
		/*
		 for문을 이용하여 
		         *
		       **
		     ***
		   ****
		 *****  형식을 출력
		 */
		String str = "";
		int num = 10;
		for (int i=1; i<num; i++) {
			for (int j=1; j<num-i; j++) {
				str += " ";
			}
			for (int j=1; j<i; j++) {
				str += "*";
			}
			System.out.println(str);
			str = "";
		}
		
		

	}

}
