package questions;

class Vehicle{
	public void drive() {
		System.out.println("Repairing a car");
	}
}

class Car extends Vehicle{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		super.drive();
	}
	
}

public class Repair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.drive();
	}

}
