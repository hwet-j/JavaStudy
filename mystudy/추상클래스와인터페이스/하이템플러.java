package 추상클래스와인터페이스;

public class 하이템플러 extends 프로토스 implements 지상유닛, 공격{
	// 하이템플러만의 특성
	void 사이오닉스톰() {
		System.out.println("하이템플러가 스킬 사이오닉 스톰을 사용합니다.");
	}
	void 할루시() {
		System.out.println("하이템플러가 스킬 할루시네이션을 사용합니다.");
	}
	
	
	@Override
	void 쉴드회복() {
		System.out.println("하이템플러의 쉴드가 초당 1씩 회복합니다.");
	}

	@Override
	void 쉴드업글() {
		System.out.println("하이템플러의 쉴드방어력이 1증가합니다.");
	}

	@Override
	void 이동() {
		System.out.println("하이템플러가 느린속도로 이동합니다.");
	}

	@Override
	void 정지() {
		System.out.println("하이템플러가 느린속도로 이동합니다.");
	}

	@Override
	void 홀드() {
		System.out.println("하이템플러가 현재위치에 고정합니다.");
	}

	@Override
	void 패트롤() {
		System.out.println("하이템플러가 특정구간을 반복 이동합니다.");
	}

	@Override
	void 공격받음() {
		System.out.println("하이템플러가 공격을 받습니다.");
	}
	
	@Override
	public void 지상방업() {
		System.out.println("하이템플러의 방어력이 1 증가");
	}
	@Override
	public void 공격() {
		System.out.println("하이템플러가 공격 명령을 받습니다.");
	}
	


	
}
