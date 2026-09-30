package EventsBasedObserverPattern.Observers;

import EventsBasedObserverPattern.Events.IEvent;

public interface IObserver {
    void update(IEvent event);
}
