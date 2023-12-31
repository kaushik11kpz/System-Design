package WithoutLiskovSubstitutionPrinciple;

public class Bicycle extends Vehicle{

	public boolean isEngineOn;
	public int speed;
	
	@Override
	public void turnOnEngine() {
		// TODO Auto-generated method stub
		throw new AssertionError("there is no engine");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		// accelerate
	}

	
}
