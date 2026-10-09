package IteratorPattern;

import java.util.List;

/**
 * ProductRatingIterator
 */
public class ProductRatingIterator implements IIterator {
    private List<Product> products;
    private int currentIndex = 0;

    ProductRatingIterator(List<Product> products) {
        this.products = products;

        if(this.products != null) {
            this.products.sort((p1, p2) -> Double.compare(p2.getRating(), p1.getRating()));
        }
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
