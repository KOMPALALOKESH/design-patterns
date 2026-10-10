public class CreditCardPaymentStrategy implements IPaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using credit card payment strategy.");
    }

}
