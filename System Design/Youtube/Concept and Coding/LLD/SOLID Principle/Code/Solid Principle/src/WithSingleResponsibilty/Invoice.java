package WithSingleResponsibilty;

import WithoutSingleResponsibilty.Marker;

public class Invoice {

	private Marker marker;
	private int quantity;
	
	public Invoice(Marker marker, int qunatity) {
		this.marker = marker;
		this.quantity = quantity;
	}
	
	public int calculateTotal() {
		int price = ((marker.price) * this.quantity);
		return price;
	}
	
}
