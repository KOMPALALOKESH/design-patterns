package ChainOfResponsibility;

public class PaymentHandler extends IHandler {

    @Override
    public void handleRequest(Order order) {
        if (!order.isPaymentSuccessful()) {
            System.out.println("Payment is not successful. Cannot process the order.");
        } else if (nextHandler != null) {
            System.out.println("Payment is successful. Proceeding with the order.");
            nextHandler.handleRequest(order);
        } else {
            System.out.println("No handler available for the request.");
        }
    }

}
