package chap12;

public class PrintThread1 extends Thread{
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		PrintThread1 thread = new PrintThread1();
		thread.start();
		
		try {
			System.out.println("실행중............");
			Thread.sleep(4000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}

}
