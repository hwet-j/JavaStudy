package chap12;

public class ThreadA extends Thread {
	public ThreadA() {
		setName("ThreadA");
	}
	
	public void run() {
		for (int i=1; i<6; i++) {
			String name = getName();
			System.out.println(name + "이라는 스레드임");
		}
	}
	
}
