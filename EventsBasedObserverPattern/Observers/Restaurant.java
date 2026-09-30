package EventsBasedObserverPattern.Observers;

import EventsBasedObserverPattern.Events.IEvent;
import EventsBasedObserverPattern.Events.OrderConfirmedEvent;
import EventsBasedObserverPattern.Events.OrderDeliveredEvent;
import EventsBasedObserverPattern.Events.OrderPickedUpEvent;

public class Restaurant implements IObserver {
    @Override
    public void update(IEvent event) {
        if (event instanceof OrderConfirmedEvent) {
            System.out.println("Restaurant: Order confirmed. Preparing the order.");
        } else if (event instanceof OrderPickedUpEvent) {
            System.out.println("Restaurant: Order picked up by delivery person.");
        } else if (event instanceof OrderDeliveredEvent) {
            System.out.println("Restaurant: Order delivered to the customer.");
        }
    }

}
