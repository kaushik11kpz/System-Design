package WithoutInterfaceSegmentationPrinciple;

public class Waiter implements RestaurantEmployee{

	@Override
	public void washDishes() {
		// TODO Auto-generated method stub
		// not my job
	}

	@Override
	public void serveCustomers() {
		// TODO Auto-generated method stub
		System.out.println("serving the customer");
	}

	@Override
	public void cookFood() {
		// TODO Auto-generated method stub
		// not my job
	}

	
}
