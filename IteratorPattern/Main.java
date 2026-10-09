package IteratorPattern;

public class Main {
    
    public static void main(String[] args) {
        Product product1 = new Product(1, 4.5, "diapers");
        Product product2 = new Product(2, 3.5, "milk");
        Product product3 = new Product(3, 5.0, "bread");
        
        Aggregator aggregator = new Aggregator();
        aggregator.addProduct(product1);
        aggregator.addProduct(product2);
        aggregator.addProduct(product3);

        IIterator productIterator = aggregator.createIterator();
        System.out.println("Products:");
        while (productIterator.hasNext()) {
            System.out.println(productIterator.next());
        }

        IIterator ratingIterator = aggregator.createRatingIterator();
        System.out.println("Products (by rating):");
        while (ratingIterator.hasNext()) {
            System.out.println(ratingIterator.next());
        }
    }
}
