package IteratorPattern;

import java.util.List;

/**
 * ProductIterator
 */
public class ProductIterator implements IIterator {
    List<Product> products;
    private int currentIndex = 0;

    ProductIterator(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < products.size();
    }

    @Override
    public Product next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more elements");
        }
        return products.get(currentIndex++);
    }
}
