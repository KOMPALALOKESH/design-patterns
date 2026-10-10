public class DebitCardPaymentStrategy implements IPaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using debit card payment strategy.");
    }

}
