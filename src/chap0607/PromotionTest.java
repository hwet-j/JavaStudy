package chap0607;


public class PromotionTest extends Father{
	public PromotionTest() {
	}
	void childPrint() {
		System.out.println("자식 출력됨");
	}
	
	public static void main(String[] args) {
		GrandFather gf = new GrandFather();			// a번지
		gf.setGrandFather("수정했습니다.");
		
		GrandFather gf1 = new GrandFather();		// d번지
		GrandFather gf2 = gf;						// a번지
		System.out.println(gf2.getGrandFather());
	}

}







