package chap12;

public class AutoSaveThread extends Thread{
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
			save();
		}
		System.out.println("종료");
	}
	
	public void save() {
		System.out.println("자동저장");
	}
	

}
