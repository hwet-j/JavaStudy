package chap12;

import java.awt.Toolkit;

//p525
/*프로세스(process): 운영체제에서 실행중인 하나의 애플리케이션을 말한다
 * ->사용자가 애플리케이션을 실행하면  운영체제로부터 실행에 필요한 메모리를 할당받는다
 *   여러 개의 프로세스가 동시에 실행될 수 있다.
 *   각 프로세스는 독립적인  메모리 공간을 가지고 있다.
 *   특정 프로세스에 발생한 오류가   다른 프로세스에 영향을  주지x
 *   
 *스레드(thread):프로세스 내부에서  코드의 실행흐름을 말한다   
 * ->작업 단위
 *   한 프로세스는 여러 개의 스레드를 가질 수 있다.이 스레드들은 동일한 메모리 공간을 공유한다.
 *   한 스레드가 변경한 데이터는   다른 스레드들에게도 영향을 준다.
 *   
 *운영체제는 두 가지 이상의 작얼 동시에 처리하는 멀티태스킹을 할 수 있도록
 *CPU 및 메모리 자원을  프로세스마다  적절히 할당하고, 병렬로 실행시킨다.
 *
 *멀티스레드(multi thread): 하나의 프로세스에서 여러 개의 thread가 동시에 실행되는 것
 *예) 미디어플레이어 : 사운드재생과  영생재생이  동시에 실행*/

//p525 : 메인스레드만 이용되는 경우
public class BeepPrint_p525 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=1;i<6;i++) {
			toolkit.beep();
			//System.out.println("운전");
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int i=1;i<6;i++) {
			System.out.println("출력");
			//System.out.println("잠");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}















 




