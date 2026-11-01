package Facade;

public class SwiggyApplicationFacade {
    GPSService gps;
    RestaurantService restaurantService;
    CouponsService couponsService;

    public SwiggyApplicationFacade(
        GPSService gps,
        RestaurantService restaurantService,
        CouponsService couponsService
    ) {
        this.gps = gps;
        this.restaurantService = restaurantService;
        this.couponsService = couponsService;
    }

    public void startApplication() {
        System.out.println("Starting Swiggy Application...");

        gps.getCurrentLocation();
        restaurantService.getRestaurants();
        couponsService.getCoupons();
    }
}
