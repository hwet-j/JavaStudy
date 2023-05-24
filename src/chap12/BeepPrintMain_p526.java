package chap12;


// 메인 스레드와 작업 스레드가 동시에 실행
public class BeepPrintMain_p526 {

	public static void main(String[] args) {
		
		Runnable beepTask = new BeepTask_p526();	
		// 쓰레드 생성
		Thread th = new Thread(beepTask);
		
		
		th.start();
		
		for (int i=0;i<5;i++) {
			System.out.println("출력");
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
