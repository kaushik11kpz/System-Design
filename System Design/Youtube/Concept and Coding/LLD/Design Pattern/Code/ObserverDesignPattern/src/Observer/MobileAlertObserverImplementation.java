package Observer;

import Observable.StocksObservable;

public class MobileAlertObserverImplementation implements NotificationAlertObserver{

	String userName;
	StocksObservable observable;
	
	public MobileAlertObserverImplementation(String userName, StocksObservable observable) {
		this.userName = userName;
		this.observable = observable;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		sendMessageOnMobile(userName, "product is in stock, hurry up!");
	}
	
	public void sendMessageOnMobile(String userName, String msg) {
		System.out.println("message sent to: "+ userName);
	}
}
