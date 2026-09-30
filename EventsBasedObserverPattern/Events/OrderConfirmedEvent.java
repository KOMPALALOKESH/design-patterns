package EventsBasedObserverPattern.Events;

import EventsBasedObserverPattern.Order;

public class OrderConfirmedEvent implements IEvent {
    Order order;

    public OrderConfirmedEvent(Order order) {
        this.order = order;
    }
}
