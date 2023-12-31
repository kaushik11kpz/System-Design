package WithSingleResponsibilty;

public class InvoiceDAO {

	Invoice invoice;
	
	public InvoiceDAO(Invoice invoice) {
		this.invoice = invoice;
	}
	
	public void saveToDB() {
		//save the data into DB
	}
}
