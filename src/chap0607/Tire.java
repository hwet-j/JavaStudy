package chap0607;

//p340
public class Tire {
	//필드
	int price; //가격 
	int maxRotation;//최대회전수
	int accmulatedRotation;//누적회전수
	String location;//타이어의 위치
	
	//생성자
	Tire(String location,int maxRotation){
		this.location=location;
		this.maxRotation=maxRotation;
	}
	
	//메서드
	boolean roll() {
		if( accmulatedRotation<maxRotation){
			System.out.println(location+"Tire수명:"+
				(maxRotation-accmulatedRotation)+"회");
			return true;
		}else {
			System.out.println(location+"Tire펑크!!");
			return false;
		}
	}
}
















