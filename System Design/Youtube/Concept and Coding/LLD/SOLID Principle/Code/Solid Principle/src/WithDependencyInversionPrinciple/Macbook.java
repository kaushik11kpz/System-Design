package WithDependencyInversionPrinciple;

public class Macbook {

	private final Keyboard keyboard;
	private final Mouse mouse;
	
	
	//assigned via constructor injection
	public Macbook(Keyboard keyboard, Mouse mouse) {
		this.keyboard = keyboard;
		this.mouse = mouse;
	}
}
