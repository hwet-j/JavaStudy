package 추상클래스와인터페이스;

public class 발키리 extends 테란 implements 공중유닛, 공격, 공중공격{

	@Override
	public void 공중유닛공격() {
		System.out.println("발키리가 공주유닛을 공격합니다.");
	}

	@Override
	public void 공중방업() {
		System.out.println("발키리의 방어력이 1증가");
	}

	@Override
	void 수리또는회복() {
		System.out.println("발키리는 기계로 수리하여 체력을 회복합니다.");
	}

	@Override
	void 이동() {
		System.out.println("발키리가 이동합니다.");
		
	}

	@Override
	void 정지() {
		System.out.println("발키리가 정지합니다.");
	}

	@Override
	void 홀드() {
		System.out.println("발키리가 현재위치를 고정합니다.");
	}

	@Override
	void 패트롤() {
		System.out.println("발키리가 특정위치를 반복이동합니다.");
	}

	@Override
	void 공격받음() {
		System.out.println("발키리가 공격을 받습니다.");
	}

	@Override
	public void 공격() {
		System.out.println("발키리가 공격을 명령받습니다.");
	}
	


	
}
