package EventsBasedObserverPattern.Events;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import EventsBasedObserverPattern.Observers.IObserver;

public class EventPublisher {
    private Map<Class<?>, List<IObserver>> subscribers = new HashMap<>();

    public void subscribe(Class<?> eventType, IObserver observer) {
        subscribers
            .computeIfAbsent(eventType, k -> new ArrayList<>())
            .add(observer);
    }

    public int publish(IEvent event) {

        List<IObserver> observers = subscribers.get(event.getClass());

        if (observers == null)
            return -1;

        for (IObserver observer : observers) {
            observer.update(event);
        }
        return 0;
    }
}
