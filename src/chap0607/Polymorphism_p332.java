package chap0607;

public class Polymorphism_p332 {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle = new Vehicle();
		driver.drive(vehicle);
	}

}




class Driver{
	void drive(Vehicle vehicle) {
		vehicle.run();
	}
}

class Vehicle{
	public void run() {
		System.out.println("차량이 달립니다.");
	}
}