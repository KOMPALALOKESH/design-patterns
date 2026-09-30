package EventsBasedObserverPattern;

import EventsBasedObserverPattern.Events.*;
import EventsBasedObserverPattern.Observers.*;

public class Main {
    public static void main(String[] args) {
        EventPublisher eventPublisher = new EventPublisher();

        IObserver customer = new Customer();
        IObserver deliveryboy = new Deliveryboy();
        IObserver restaurant = new Restaurant();

        eventPublisher.subscribe(OrderPlacedEvent.class, customer);

        eventPublisher.subscribe(OrderConfirmedEvent.class, customer);
        eventPublisher.subscribe(OrderConfirmedEvent.class, deliveryboy);
        eventPublisher.subscribe(OrderConfirmedEvent.class, restaurant);

        eventPublisher.subscribe(OrderPickedUpEvent.class, customer);
        eventPublisher.subscribe(OrderPickedUpEvent.class, deliveryboy);
        eventPublisher.subscribe(OrderPickedUpEvent.class, restaurant);

        eventPublisher.subscribe(OrderDeliveredEvent.class, customer);
        eventPublisher.subscribe(OrderDeliveredEvent.class, deliveryboy);

        Order order = new Order(eventPublisher);
        order.orderplaced();
        order.orderconfirmed();
        order.orderpickedup();
        order.orderdelivered();
    }
}
