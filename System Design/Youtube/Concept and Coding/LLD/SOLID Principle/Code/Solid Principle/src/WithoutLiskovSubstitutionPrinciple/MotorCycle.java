package WithoutLiskovSubstitutionPrinciple;

public class MotorCycle implements Bike{
	
	boolean isEngineOn;
	int speed;

	@Override
	public void turnOnEngine() {
		// TODO Auto-generated method stub
		isEngineOn = true;
		
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		speed = speed + 10;
	}
	
}
