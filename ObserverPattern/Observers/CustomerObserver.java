package ObserverPattern.Observers;

public class CustomerObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Customer received update: " + message);
    }

}
