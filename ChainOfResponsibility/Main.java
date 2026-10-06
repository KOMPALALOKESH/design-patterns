package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        // Create handlers
        IHandler restaurantHandler = new RestaurantHandler();
        IHandler deliveryHandler = new DeliveryHandler();
        IHandler paymentHandler = new PaymentHandler();

        // Set up the chain of responsibility
        restaurantHandler.setNextHandler(deliveryHandler);
        deliveryHandler.setNextHandler(paymentHandler);
        paymentHandler.setNextHandler(new OrderConfirmationHandler());

        // Create an order
        Order order = new Order(true, true, true);

        // Start the request handling process
        restaurantHandler.handleRequest(order);
        System.out.println("-----");

        Order order2 = new Order(true, false, true);
        restaurantHandler.handleRequest(order2);
    }
}
