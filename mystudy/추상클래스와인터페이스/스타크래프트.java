package 추상클래스와인터페이스;

public abstract class 스타크래프트 {
	// 스타크래프트의 특성?
	abstract void 이동();		// 
	abstract void 정지();		// 
	abstract void 홀드();		// 일꾼은 없기는 하지만, 홀드가 있는 유닛과 묶으면 가능하며 실제로 홀드를 한다. 왜인지 생각 
	// --> 홀드의 기능이 없는것이 아니라 홀드의 기능은 있지만 (다른 기능이 너무많아) 클릭 버튼을 생성하지 않아 다른유닛과 합쳤을때 공통 기능으로 표시된다로 이해함. 
	abstract void 패트롤();	// 
	abstract void 공격받음();	// 
	
}
