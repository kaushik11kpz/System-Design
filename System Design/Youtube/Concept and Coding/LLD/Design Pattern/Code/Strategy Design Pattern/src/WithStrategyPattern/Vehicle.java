package WithStrategyPattern;

public class Vehicle {
	
	//Vehicle has a DriveStrategy
	DriveStrategy driveObj;
	
	Vehicle(DriveStrategy driveObj){
		this.driveObj = driveObj;
	}
	
	public void drive() {
		driveObj.drive();
	}

}
