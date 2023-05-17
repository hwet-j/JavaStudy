package 추상클래스와인터페이스;

public class 스타Main {

	public static void main(String[] args) {
		질럿 zealot = new 질럿();
		하이템플러 templar = new 하이템플러();
		저글링 zergling = new 저글링();
		발키리 valkyrie = new 발키리();
		스카우트 scout = new 스카우트();
		SCV scv = new SCV();
		zealot.공격받음();
		templar.공격받음();
		
		System.out.println();
		System.out.println("추상클래스 객체를 통한 배열화");
		프로토스[] protoss = new 프로토스[] {zealot, templar};	// 부모 객체로 형변환은 자동 형변환
		for (int i=0; i<protoss.length;i++ ) {
			protoss[i].이동();
		}
		
		System.out.println();
		System.out.println("인터페이스 객체를 통한 배열화");
		지상유닛[] ground = new 지상유닛[] {zergling, zealot, templar};
		for (int i=0; i<ground.length;i++ ) {
			ground[i].지상방업();
		}
		
		 공중공격[] airAttack = new 공중공격[] {valkyrie, scout};
		for (int i=0; i<airAttack.length;i++ ) {
			airAttack[i].공중유닛공격();
		}
		
//		templar.홀드();
//		scv.홀드();
		
		
		
	}	

}
