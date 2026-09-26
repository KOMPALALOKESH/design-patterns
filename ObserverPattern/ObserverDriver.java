package ObserverPattern;

import ObserverPattern.Observers.CustomerObserver;
import ObserverPattern.Observers.DeliveryBoyObserver;
import ObserverPattern.Observers.Observer;
import ObserverPattern.Observers.RestaurantObserver;

public class ObserverDriver {
    public static void main(String[] args) {
        Order order = new Order("Received");

        Observer deliveryBoyObserver = new DeliveryBoyObserver();
        Observer restaurantObserver = new RestaurantObserver();
        Observer customerObserver = new CustomerObserver();

        order.addObserver(customerObserver);
        order.addObserver(restaurantObserver);
        order.addObserver(deliveryBoyObserver);
        
        order.setStatus("placed");
        
        order.setStatus("Preparing");

        order.setStatus("Out for Delivery");

        order.setStatus("Delivered");

        /* for more about this pattern see chatgpt observer pattern chats */
    }
}
