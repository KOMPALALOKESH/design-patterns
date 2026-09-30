package EventsBasedObserverPattern.Events;

import EventsBasedObserverPattern.Order;

public class OrderPlacedEvent implements IEvent {    
    Order order;

    public OrderPlacedEvent(Order order) {
        this.order = order;
    }

}
