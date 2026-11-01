package Facade;

import java.util.List;

/**
 * RestaurantService
 */
public class RestaurantService {
    public List<String> getRestaurants() {
        System.out.println("Getting available restaurants...");
        return List.of("Restaurant 1", "Restaurant 2", "Restaurant 3");
    }
}
