
interface Vehicle {
	
    void changeGear(int gear);
	void speedUp(int speed);
	void applyBrakes(int breaks);
	void printStates();
}

class Bike{
	
	int speed;
	int gear;
	
	// @Override
	public void changeGear(int newGear){
		
		gear = newGear;
	}
	
	// @Override
	public void speedUp(int increment){
		
		speed = speed + increment;
	}
	
	// @Override
	public void applyBrakes(int decrement){
		
		speed = speed - decrement;
	}
	
	public void printStates() {
		System.out.println("speed: " + speed + " gear: " + gear);
	}
	public static void main (String[] args) {
		
		Vehicle obj = new Car();
		obj.changeGear(2);
		obj.speedUp(3);
		obj.applyBrakes(1);
		
		System.out.println("car present state :");
		// Car car = new Car();
		obj.printStates();
		
		Bike bike = new Bike();
		bike.changeGear(1);
		bike.speedUp(4);
		bike.applyBrakes(3);
		
		System.out.println("Bike present state :");
		bike.printStates();
	}
}
