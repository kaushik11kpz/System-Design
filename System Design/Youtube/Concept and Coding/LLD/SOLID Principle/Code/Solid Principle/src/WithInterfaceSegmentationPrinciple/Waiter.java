package WithInterfaceSegmentationPrinciple;

public class Waiter implements WaiterInterface{

	@Override
	public void serveCustomers() {
		// TODO Auto-generated method stub
		System.out.println("serving the customers");
	}

	@Override
	public void takeOrders() {
		// TODO Auto-generated method stub
		System.out.println("taking orders");
	}

}
