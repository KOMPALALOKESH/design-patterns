package ChainOfResponsibility;

public class RestaurantHandler extends IHandler {

    @Override
    public void handleRequest(Order order) {
        if(!order.isRestauarantOpen()) {
            System.out.println("Restaurant is not available. Cannot process the order.");
        } else if (nextHandler != null) {
            System.out.println("Restaurant is available. Proceeding with the order.");
            nextHandler.handleRequest(order);
        } else {
            System.out.println("No handler available for the request.");
        }
    }

}
