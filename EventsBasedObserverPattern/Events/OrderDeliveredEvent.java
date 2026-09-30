package EventsBasedObserverPattern.Events;

import EventsBasedObserverPattern.Order;

public class OrderDeliveredEvent implements IEvent {
    Order order;

    public OrderDeliveredEvent(Order order) {
        this.order = order;
    }

}
