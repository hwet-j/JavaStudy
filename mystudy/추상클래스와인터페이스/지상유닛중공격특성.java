package 추상클래스와인터페이스;

// 지상유닛중 공격특성을 가진 유닛 (전체 지상유닛이 가진 특성은 지상유닛 인터페이스에)
public interface 지상유닛중공격특성 extends 지상유닛{
	abstract void 지상공업();		// 공격의 경우 디텍터 X 
}
