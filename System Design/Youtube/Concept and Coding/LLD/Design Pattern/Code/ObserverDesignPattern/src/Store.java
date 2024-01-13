import Observable.StocksObservable;
import Observable.IPhoneObservableImplementation;
import Observer.NotificationAlertObserver;
import Observer.EmailAlertObserverImplementation;
import Observer.MobileAlertObserverImplementation;

public class Store {
 
	public static void main(String args[]) {
		
		StocksObservable iphoneStockObservable = new IPhoneObservableImplementation();
		
		NotificationAlertObserver observer1 = new EmailAlertObserverImplementation("abc@gmail.com", iphoneStockObservable);
		NotificationAlertObserver observer2 = new EmailAlertObserverImplementation("ghi@gmail.com", iphoneStockObservable);
		NotificationAlertObserver observer3 = new MobileAlertObserverImplementation("user1", iphoneStockObservable);
		
		iphoneStockObservable.add(observer1);
		iphoneStockObservable.add(observer2);
		iphoneStockObservable.add(observer3);
		
		iphoneStockObservable.setStockCount(10);
	}
}
