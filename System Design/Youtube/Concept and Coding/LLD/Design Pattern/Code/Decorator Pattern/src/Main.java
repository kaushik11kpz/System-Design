import base.BasePizza;
import base.Margherita;
import decorator.ExtraCheese;
import decorator.Mushroom;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasePizza pizza = new Mushroom(new ExtraCheese(new Margherita()));
		System.out.println(pizza.cost());
	}

}
