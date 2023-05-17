package 추상클래스와인터페이스;

public class 질럿 extends 프로토스 implements 지상유닛, 공격, 지상공격{
	void 발업() {
		System.out.println("질럿의 발업이 완료되었습니다.");
	}
	
	


	@Override
	void 쉴드회복() {
		System.out.println("질럿의 쉴드가 초당 1씩 회복됩니다.");
	}

	@Override
	void 쉴드업글() {
		System.out.println("질럿의 쉴드 방어력이 1 증가합니다.");
	}

	@Override
	void 이동() {
		System.out.println("질럿이 이동합니다.");
	}

	@Override
	void 정지() {
		System.out.println("질럿이 정지합니다.");
	}

	@Override
	void 홀드() {
		System.out.println("질럿이 위치를 고정합니다.");
	}

	@Override
	void 패트롤() {
		System.out.println("질럿이 특정 위치를 반복 이동합니다.");
	}

	@Override
	void 공격받음() {
		System.out.println("질럿이 피해를 받습니다.");
	}




	@Override
	public void 지상유닛공격() {
		System.out.println("질럿이 지상유닛을 공격합니다.");
	}


	@Override
	public void 지상방업() {
		System.out.println("질럿의 방어력 1증가");
	}
	
	@Override
	public void 공격() {
		System.out.println("질럿이 공격 명령을 받습니다.");
	}

}
