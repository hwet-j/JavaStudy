package 추상클래스와인터페이스;

public class SCV extends 테란 implements 지상유닛, 지상공격, 공격{

	@Override
	void 이동() {
		System.out.println("SCV이 이동합니다.");		
	}
	
	@Override
	void 정지() {
		System.out.println("SCV이 현재위치에서 멈춥니다.");
	}
	
	@Override
	protected void 홀드() {
		System.out.println("SCV이 현재위치에서 고정(홀드)합니다.");
	}

	@Override
	void 패트롤() {
		System.out.println("SCV이 특정 구간을 반복이동합니다.");
	}

	@Override
	void 공격받음() {
		System.out.println("SCV의 체력이 감소합니다.");
	}
	
	@Override
	public void 지상방업() {
		System.out.println("SCV 방어력 1증가");
	}

	@Override
	public void 지상유닛공격() {
		System.out.println("SCV이 지상유닛을 공격합니다.");
	}

	@Override
	void 수리또는회복() {
		System.out.println("SCV는 생명체이며 기계로 회복과 수리가능");
	}
	
	@Override
	public void 공격() {
		System.out.println("SCV가 공격 명령을 받습니다.");
	}


	
	
}
