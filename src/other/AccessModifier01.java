package other;

/* 접근 제한자(Access Modifier)
- 클래스 및 클래스의 구성 멤버에 대한 접근을 제한하는 역할
- 다른 패키지에서 클래스를 사용하지 못하도록 (클래스 제한)
- 클래스로부터 객체를 생성하지 못하도록 (생성자 제한)
- 특정 필드와 메서드를 숨김 처리 (필드와 메서드 제한)

* 접근 제한자의 종류
- public : 제한 없음 / 클래스, 필드, 생성자, 메서드
- protected : 자식 클래스가 아닌 다른 패키지에 소속된 클래스에서 접근을 제한한다. / 필드, 생성자, 메서드
- default : 다른 패키지에 속한 클래스에서의 접근을 제한한다. / 클래스, 필드, 생성자, 메서드
- private : 모든 외부 클래스에서 접근을 제한 / 필드, 생성자, 메서드


*/
public class AccessModifier01 {
	private int pri = 10;
	int pack = 10;	// default는 아무것도 작성하지 않으면 된다. (명시 불가) 
	protected int pro = 10;
	public int pub = 10;

	void test() {
		pri = 20;
		pack = 20;
		pro = 20;
		pub = 20; 
		// ==> 동일 클래스 내에서 접근은 모든 접근제한자가 가능하다.
	}
}
