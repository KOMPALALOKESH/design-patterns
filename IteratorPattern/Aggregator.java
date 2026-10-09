package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class Aggregator {
    private List<Product> products;

    public Aggregator() {
        this.products = new ArrayList<>();
    }

    public IIterator createIterator() {
        return new ProductIterator(products);
    }

    public IIterator createRatingIterator() {
        return new ProductRatingIterator(products);
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
