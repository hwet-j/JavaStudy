package chap0607;

//p94
//Polymorphism(다형성) -매개변수의 다형성

class BusP393 implements Vehicle_p393{
	@Override
	public void run() {
		System.out.println("Bus-run()");
	}
}
class TaxiP393 implements Vehicle_p393{
	@Override
	public void run() {
		System.out.println("택시-run()");
	}
}

public class Polymorphism_p394 {
	public static void main(String[] args) {
		DriverP393 driver = new DriverP393();
		//driver.drive(new Vehicle_p393());//에러발생.인터페이스는 생성자가 없다
		//Cannot instantiate the type Vehicle_p393
		
		BusP393 bus = new BusP393();
		driver.drive(bus);//Bus-run()
		
		TaxiP393 taxi = new TaxiP393();
		driver.drive(taxi);//택시-run()
		
	   //driver.drive(new Car05());//에러발생
	   //The method drive(Vehicle) in the type Driver 
	   //	is not applicable 
	   //	for the arguments (Car05)	
	}
}

//p393
class DriverP393{
	void drive(Vehicle_p393 vehicle) {
		vehicle.run();
	}
}















