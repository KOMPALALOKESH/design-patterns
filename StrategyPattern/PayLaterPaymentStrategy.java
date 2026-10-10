/**
 * PayLaterPaymentStrategy
 */
public class PayLaterPaymentStrategy implements IPaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using pay later payment strategy.");
    }

}
