//Question- Implement notify me feature in an out of stock product on Amazon website. When the product is available send notification to all the customers who have subscribed to this product using notify me button.
//Source- Asked in Walmart Round 3 Interview

package Observable;

import Observer.NotificationAlertObserver;
public interface StocksObservable {

	public void add(NotificationAlertObserver observer);
	
	public void remove(NotificationAlertObserver observer);
	
	public void notifySubscribers();
	
	public void setStockCount(int newStockAdded);
	
	public int getStockCount();
}
