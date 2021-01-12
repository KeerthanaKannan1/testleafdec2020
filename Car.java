package week1.day1;

public class Car {
	
	String bodyColor = "Red";
	int numWheels = 4;
	String regNumber = "TN 09 AU 4567";
	double fuelCapacity = 56.45;
    char fuelType = 'p';
    
	public void driveCar() {
	int numOfDrivers = 2;
		System.out.println("i drive car");
		System.out.println("i like it");

	}
	private void applyBreak() {
		System.out.println("applied break");

	}
	
	public static void main(String[] args) {
		
		Car obj = new Car();
		 obj.driveCar();
		 obj.applyBreak();
		 
		System.out.println(obj.fuelCapacity); 
		 String color = obj.bodyColor;
		 System.out.println(color);
	}
}
