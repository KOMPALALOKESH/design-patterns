package EventsBasedObserverPattern.Observers;

import EventsBasedObserverPattern.Events.IEvent;
import EventsBasedObserverPattern.Events.OrderConfirmedEvent;
import EventsBasedObserverPattern.Events.OrderDeliveredEvent;
import EventsBasedObserverPattern.Events.OrderPickedUpEvent;

public class Customer implements IObserver {
    @Override
    public void update(IEvent event) {
        if (event instanceof OrderConfirmedEvent) {
            System.out.println("Customer: Order confirmed!");
        } else if (event instanceof OrderPickedUpEvent) {
            System.out.println("Customer: Order picked up!");
        } else if (event instanceof OrderDeliveredEvent) {
            System.out.println("Customer: Order delivered!");
        }
    }

}
