package Observer;

import Observable.StocksObservable;

public class EmailAlertObserverImplementation implements NotificationAlertObserver{

	String emailId;
	StocksObservable observable;
	
	public EmailAlertObserverImplementation(String emailId, StocksObservable observable) {
		this.emailId = emailId;
		this.observable = observable;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		sendEmail(emailId, "product is in stock, hurry up!");
	}
	
	public void sendEmail(String emailId, String msg) {
		System.out.println("mail sent to: "+ emailId);
	}

}
