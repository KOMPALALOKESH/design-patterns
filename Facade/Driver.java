package Facade;

public class Driver {
    public static void main(String[] args) {
        GPSService gpsService = new GPSService();
        RestaurantService restaurantService = new RestaurantService();
        CouponsService couponsService = new CouponsService();

        SwiggyApplicationFacade swiggyApp = new SwiggyApplicationFacade(gpsService, restaurantService, couponsService);
        swiggyApp.startApplication();

        System.out.println("Available Coupons:");
        swiggyApp.couponsService.getCoupons().forEach(System.out::println);
    }

}
