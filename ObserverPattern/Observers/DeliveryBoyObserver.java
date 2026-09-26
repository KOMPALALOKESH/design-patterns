package ObserverPattern.Observers;

public class DeliveryBoyObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Delivery Boy received update: " + message);
    }
}
