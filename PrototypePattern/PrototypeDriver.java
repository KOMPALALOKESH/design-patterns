package PrototypePattern;

import java.util.*;

public class PrototypeDriver {
    public static void main(String[] args) {
        // Amazon Reorder using prototype pattern 

        Order order1 = new Order(
            "1",
            new ArrayList<>(List.of("item1", "item2")),
            "123 Main St"
        );

        Order order2 = order1.clone();
        order2.orderId = "2"; // Change orderId for the cloned order

        order2.items.set(0, "item3"); // Modify the items list in the cloned order

        System.out.println("Original Order: " + order1.orderId + ", Items: " + order1.items + ", Address: " + order1.address);
        System.out.println("Cloned Order: " + order2.orderId + ", Items: " + order2.items + ", Address: " + order2.address);
    }
}
