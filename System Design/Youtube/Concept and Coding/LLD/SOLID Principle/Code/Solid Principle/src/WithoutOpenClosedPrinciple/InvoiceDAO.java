package WithoutOpenClosedPrinciple;

import WithSingleResponsibilty.Invoice;

public class InvoiceDAO {
	
	Invoice invoice;
	
	public InvoiceDAO(Invoice invoice) {
		this.invoice = invoice;
	}
	
	public void saveToDB() {
		//save Invoice into DB
	}
	
	//modifying InvoiceDAO class-It is prone to bugs
	public void saveToFile(String fileName) {
		//save invoice in the file with the given name.
	}

}
