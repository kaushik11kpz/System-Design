package WithLiskovSubstitutionPrinciple;

import java.util.ArrayList;

public class Main {

	public static void main(String args[]) {
		
		ArrayList<Vehicle> vehicleList = new ArrayList<>();
		vehicleList.add(new MotorCycle());
		vehicleList.add(new Car());
		vehicleList.add(new Bicycle());
		
		for(Vehicle vehicle : vehicleList) {
			System.out.println(vehicle.getNumberOfWheels());
		}
	}
}
