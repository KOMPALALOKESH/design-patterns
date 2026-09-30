package EventsBasedObserverPattern.Observers;

import EventsBasedObserverPattern.Events.IEvent;
import EventsBasedObserverPattern.Events.OrderConfirmedEvent;
import EventsBasedObserverPattern.Events.OrderDeliveredEvent;
import EventsBasedObserverPattern.Events.OrderPickedUpEvent;

public class Deliveryboy implements IObserver {
    @Override
    public void update(IEvent event) {
        if (event instanceof OrderConfirmedEvent) {
            System.out.println("Delivery boy received order confirmed event.");
        } else if (event instanceof OrderPickedUpEvent) {
            System.out.println("Delivery boy received order picked up event.");
        } else if (event instanceof OrderDeliveredEvent) {
            System.out.println("Delivery boy received order delivered event.");
        }
    }

}
