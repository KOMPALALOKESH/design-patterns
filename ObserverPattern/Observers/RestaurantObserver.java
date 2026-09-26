package ObserverPattern.Observers;

public class RestaurantObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Restaurant received update: " + message);
    }

}
