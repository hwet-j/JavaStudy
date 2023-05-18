package chap0607;

//p343
public class Car07_p343 {

	public static void main(String[] args) {
		Car07 car = new Car07();
		
		for(int i=1;i<=5;i++) {
			//문제없으면0, 1 2 3 4
			System.out.println(">>"+i+"번째 run()호출");
			int problemLoc = car.run();
			switch(problemLoc) {
			case 1: 
				System.out.println("앞왼쪽 새타이어로 교체");
				car.fL_Tire = new Tire("앞왼쪽 ",15);
				break;
			case 2: 
				System.out.println("앞R쪽 새타이어로 교체");
				car.fR_Tire = new Tire("앞R쪽 ",13);
				break;
			case 3: 
				System.out.println("뒤왼쪽 새타이어로 교체");
				car.bL_Tire = new Tire("뒤왼쪽 ",14);
				break;
			case 4: 
				System.out.println("뒤R쪽 새타이어로 교체");
				car.bR_Tire = new Tire("뒤R쪽 ",17);
				break;
			}
			System.out.println("-------");
		}//for
	}

}





