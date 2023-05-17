package 추상클래스와인터페이스;

public class 스카우트 extends 프로토스 implements 공중유닛, 공격, 공중공격{

	@Override
	public void 공중방업() {
		System.out.println("스카우트의 방어력이 1증가");
	}

	@Override
	void 이동() {
		System.out.println("스카우트가 이동합니다.");
	}

	@Override
	void 정지() {
		System.out.println("스카우트가 정지합니다.");
	}

	@Override
	void 홀드() {
		System.out.println("스카우트가 현재위치를 고정합니다.");
	}

	@Override
	void 패트롤() {
		System.out.println("스카우트가 특정위치를 반복이동합니다.");
	}

	@Override
	void 공격받음() {
		System.out.println("스카우트가 공격을 받습니다.");
	}

	@Override
	void 쉴드회복() {
		System.out.println("스카우트가 초당 1씩 쉴드를 회복합니다.");
	}

	@Override
	void 쉴드업글() {
		System.out.println("스카우트의 쉴드방어력이 1 증가합니다.");
	}

	@Override
	public void 공격() {
		System.out.println("스카우트가 공격 명령(지상공격 또는 공중공격)을 받습니다.");
	}

	@Override
	public void 공중유닛공격() {
		System.out.println("스카우트가 공중공격을 합니다.");
	}
	


	
}
