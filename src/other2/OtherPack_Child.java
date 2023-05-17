package other2;
import other.AccessModifier01;

public class OtherPack_Child extends AccessModifier01{
	// 다른 패키지 자식클래스 => public, protected 접근 가능
	public OtherPack_Child() {
		// pri = 20;	// private 제한자 접근불가	
		// pack = 20;	// default 제한자 접근불가
		pro = 20;
		pub = 20;
	}
		
}
			
