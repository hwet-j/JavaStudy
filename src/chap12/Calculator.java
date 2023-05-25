package chap12;

public class Calculator {
	private int memory;
	public int getMemory() {
		return memory;
	}
	// 동기화된 메서드
	// 메서드 전체 내용이 임계영역이므로 스레드가 동기화 메서드를 실행하는 즉시
	// 객체에는 잠금이 일어나고, 스레드가 동기화 메서드를 종료하면 잠금이 풀린다.
	
	// 임계 영역이란? 멀티 스레드 프로그램에서 단 하나의 스레드만 실행할 수 있는 영역을 말한다.
	// 자바에서는 임계영역을 지정하기 위해 동기화 메서드(synchronized)를 제공한다.
	public synchronized void setMomory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000); // 쓰레드를 2초간 일시정지 시킴
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}
