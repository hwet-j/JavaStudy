package chap12;

import java.awt.Toolkit;

/*멀티스레드(multi thread): 하나의 프로세스에서 여러 개의 thread가 동시에 실행되는 것 
 * 예) 미디어플레이어 : 사운드재생과  영생재생이  동시에 실행*/

//p526
//Beep음 소리 작업
//Runnable인터페이스를 구현한 클래스
public class BeepTask_p526 implements Runnable{

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=1;i<6;i++) {
			toolkit.beep();
			//System.out.println("사운드재생");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
