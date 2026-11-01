package Facade;

import java.util.List;

/**
 * CouponsService
 */
public class CouponsService {    
    public List<String> getCoupons() {
        System.out.println("Getting available coupons...");
        return List.of("Coupon 1", "Coupon 2", "Coupon 3");
    }

    public void applyCoupon(Order order, String couponCode) {
        System.out.println("Applying coupon: " + couponCode);
    }
}
