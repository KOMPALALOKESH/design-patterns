package ChainOfResponsibility;

public class OrderConfirmationHandler extends IHandler {

    @Override
    public void handleRequest(Order order) {
        if (!order.isPaymentSuccessful()) {
            System.out.println("Payment failed. Cannot confirm the order.");
        } else {
            System.out.println("order is confirmed.");
        }
    }

}
