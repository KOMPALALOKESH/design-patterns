package EventsBasedObserverPattern.Events;

import EventsBasedObserverPattern.Order;

public class OrderPickedUpEvent implements IEvent {
    Order order;

    public OrderPickedUpEvent(Order order) {
        this.order = order;
    }

}
