package Facade;

/**
 * Order
 */
public class Order {
    
    private String id;
    private double totalAmount;
    private String couponCode;
    
    public Order(String id, double totalAmount, String couponCode) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.couponCode = couponCode;
    }
    
    // Getters and setters
    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

}
