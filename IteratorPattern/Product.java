package IteratorPattern;

public class Product {
    private int id;
    private double rating;
    private String name;

    public Product(int id, double rating, String name) {
        this.id = id;
        this.rating = rating;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", rating=" + rating +
                ", name='" + name + '\'' +
                '}';
    }
}
