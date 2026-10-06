package ChainOfResponsibility;

public class Order {
    private boolean isRestauarantOpen;
    private boolean isDeliveryAvailable;
    private boolean isPaymentSuccessful;

    public Order(boolean isRestauarantOpen, boolean isDeliveryAvailable, boolean isPaymentSuccessful) {
        this.isRestauarantOpen = isRestauarantOpen;
        this.isDeliveryAvailable = isDeliveryAvailable;
        this.isPaymentSuccessful = isPaymentSuccessful;
    }

    public boolean isRestauarantOpen() {
        return isRestauarantOpen;
    }

    public boolean isDeliveryAvailable() {
        return isDeliveryAvailable;
    }

    public boolean isPaymentSuccessful() {
        return isPaymentSuccessful;
    }

}
