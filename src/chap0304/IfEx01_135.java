package chap0304;

import java.util.Scanner;

/*if (조건1) {
	 조건1의 코드	
} else if (조건2){
	조건2의 코드 (조건1을 만족하지 않고 조건2를 만족할 때)
} else if (조건3) {
	조건3의 코드 (조건1,조건2를 만족하지 않고 조건3을 만족할 때)
}else {
	어떤 조건도 만족하지 않을때 코드
}
*/


public class IfEx01_135 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if (score >= 70) {
			System.out.println("70점 이상으로 통과");
		} else {
			System.out.println("70점 미만으로 불합격");
		}
		System.out.println();
		
		// else if 를 이용
		if (score >= 90) {
			System.out.println("90점 이상으로 A학점");
		} else if (score >= 80){
			System.out.println("90점 미만 80점 이상으로 B학점");
		} else if (score >= 70){
			System.out.println("80점 미만 70점 이상으로 C학점");
		} else if (score >= 60){
			System.out.println("70점 미만 60점 이상으로 D학점");
		} else {
			System.out.println("60점 미만으로 F학점");
		}
		System.out.println();
		
		// 작성한 else if 문에 변수를 사용하여 학점 출력
		String grade = "";
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80){
			grade = "B";
		} else if (score >= 70){
			grade = "C";
		} else if (score >= 60){
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println(grade + "학점");
		
		System.out.println("===논리연산자===");
		if (score >= 90 && score <= 100) {
			grade = "A";
		} else if (score >= 80 && score < 90){
			grade = "B";
		} else if (score >= 70 && score < 80){
			grade = "C";
		} else if (score >= 60 && score < 70){
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println(grade + "학점"); 

	}

}
