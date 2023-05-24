package chap12;

// 스레드의 이름 출력 및 UserThread 생성 및 시작
// Thread.currentThread() : 현재 스레드얻기
// 참조변수.setName("스레드 이름") : 스레드 이름 설정
// 참조변수.getName() : 스레드 이름가져오기


public class ThreadName_p531 {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("현재 쓰레드");
		
		
	}

}
