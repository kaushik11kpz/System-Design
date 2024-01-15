package decorator;

import base.BasePizza;

public class ExtraCheese extends ToppingDecorator{

	BasePizza basePizza;
	
	public ExtraCheese(BasePizza basePizza) {
		this.basePizza = basePizza;
	}
	
	public int cost() {
		// TODO Auto-generated method stub
		return this.basePizza.cost() + 10;
	}

}
