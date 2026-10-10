public class UPIPaymentStrategy implements IPaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI payment strategy.");
    }
}
