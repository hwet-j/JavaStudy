package 추상클래스와인터페이스;

public class 저글링 extends 저그 implements 지상유닛중공격특성{

	@Override
	void 이동() {
		System.out.println("저글링이 이동합니다.");		
	}
	
	@Override
	void 정지() {
		System.out.println("저글링이 현재위치에서 멈춥니다.");
	}

	@Override
	void 홀드() {
		System.out.println("저글링이 현재위치에서 고정(홀드)합니다.");
	}

	@Override
	void 패트롤() {
		System.out.println("저글링이 특정 구간을 반복이동합니다.");
	}

	@Override
	void 공격받음() {
		System.out.println("저글링의 체력이 감소합니다.");
	}
	
	//////////////////////////////////////////
	//////////////////////////////////////////
	// 저그의 특성 
	@Override
	void 체력회복() {
		System.out.println("저글링이 1초에 체력1씩 회복합니다.");
	}


	@Override
	public void 지상방업() {
		System.out.println("저글링이 방어력이 1증가합니다.");
	}

	@Override
	public void 지상공업() {
		System.out.println("저글링의 공격력이 1증가합니다.");
	}


	
	
}
