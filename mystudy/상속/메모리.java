package 상속;


class 메모리실험 {
	
}


public class 메모리 {
	
	public static void main(String[] args) {
		메모리실험 메모리1 = new 메모리실험();
		메모리실험 메모리2 = new 메모리실험();
		메모리실험 메모리3 = new 메모리실험();
		메모리실험 메모리4 = null;
		System.out.println(메모리3);
		System.out.println(메모리1);
		System.out.println(메모리2);
		System.out.println(메모리4);
		메모리4 = 메모리3;
		
		System.out.println(메모리3);
		System.out.println(메모리4);
		System.out.println(메모리1);
		System.out.println(메모리2);
		System.out.println();
		System.out.println(System.identityHashCode(메모리1));
		System.out.println(System.identityHashCode(메모리2));
		System.out.println(System.identityHashCode(메모리3));
		System.out.println(System.identityHashCode(메모리4));
		System.out.println();
		메모리1 = new 메모리실험();
		메모리2 = new 메모리실험();
		메모리3 = new 메모리실험();
		System.out.println(System.identityHashCode(메모리1));
		System.out.println(System.identityHashCode(메모리2));
		System.out.println(System.identityHashCode(메모리3));
		System.out.println(System.identityHashCode(메모리4));
		
	}
}
