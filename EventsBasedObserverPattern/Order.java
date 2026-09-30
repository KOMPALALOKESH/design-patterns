package EventsBasedObserverPattern;

import EventsBasedObserverPattern.Events.*;

public class Order {
    EventPublisher eventPublisher;

    public Order(EventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    void orderplaced() {
        eventPublisher.publish(new OrderPlacedEvent(this));
    }

    void orderconfirmed() {
        eventPublisher.publish(new OrderConfirmedEvent(this));
    }

    void orderpickedup() {
        eventPublisher.publish(new OrderPickedUpEvent(this));
    }

    void orderdelivered() {
        eventPublisher.publish(new OrderDeliveredEvent(this));
    }
}