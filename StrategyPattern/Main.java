public class Main {
    public static void main(String[] args) {
        PaymentServiceProvider paymentServiceProvider = new PaymentServiceProvider();

        // Using Debit Card Payment Strategy
        paymentServiceProvider.setPaymentStrategy(new DebitCardPaymentStrategy());
        paymentServiceProvider.processPayment(100);

        // Using Credit Card Payment Strategy
        paymentServiceProvider.setPaymentStrategy(new CreditCardPaymentStrategy());
        paymentServiceProvider.processPayment(200);

        // Using UPI Payment Strategy
        paymentServiceProvider.setPaymentStrategy(new UPIPaymentStrategy());
        paymentServiceProvider.processPayment(300);

        /* after some days new payment strategy is added to the system, we can use it without changing the existing code.
        For example, if we add a new payment strategy called PayLaterPaymentStrategy, 
        we can simply create a new class that implements the IPaymentStrategy interface and use it in the same way as the other strategies.: */
        paymentServiceProvider.setPaymentStrategy(new PayLaterPaymentStrategy());
        paymentServiceProvider.processPayment(400);
    }

}
