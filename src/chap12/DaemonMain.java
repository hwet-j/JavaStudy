package chap12;

public class DaemonMain {

	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");
		AutoSaveThread asThread = new AutoSaveThread();
		
		asThread.setDaemon(true);
		asThread.start();

		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("메인 스레드 종료");
	}

}
