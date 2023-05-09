package chap0304;

public class LogicalOPEx01_p121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (true && true) {
			System.out.println("&&연산자 => if문 조건성립");
		}
		
		if (true & true) {
			System.out.println("&연산자 =>  if문 조건성립");
		}
		
		if (false && true) {		// 조건에 false가 들어가므로 deadcode
			System.out.println("&&연산자 =>  if문 조건성립");
		} else {
			System.out.println("&&연산자 =>  else문 조건성립");
		}
		
		if (false & true) {
			System.out.println("&연산자 => 거짓");
		} else {
			System.out.println("&연산자 =>  else문 조건성립");
		}
		
		String a = "h";
		String b = null;
		if (a.equals("g") && b.equals("j")) {
			System.out.println("맨족");
		}	else {
			System.out.println("불만족");
		}
		if (a.equals("g") & b.equals("j")) {
			System.out.println("만족");
		}	else {
			System.out.println("불만족");
		}
		
		
		

	}

}
