package PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class Order implements Cloneable {
    String orderId;
    List<String> items;
    String address;

    public Order(String orderId, List<String> items, String address) {
        this.orderId = orderId;
        this.items = items;
        this.address = address;
    }

    public Order clone() {
        try {
            Order clonedOrder = (Order) super.clone();
            // Deep copy of the items list
            clonedOrder.items = new ArrayList<>(this.items);
            return clonedOrder;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Should never happen
        }
    }
}
