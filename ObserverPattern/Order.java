package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

import ObserverPattern.Observers.Observer;

public class Order {
    private String status;

    List<Observer> observers = new ArrayList<>();

    public Order(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;

        notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("Order status updated to: " + status);
        }
    }
}
