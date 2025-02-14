package main.java.com.example.project.model;
import java.util.ArrayList;
import java.util.List;

public class Product {
    private String productId;
    private String name;
    private String description;
    private double price;
    private String category;

    // Constructor
    public Product(String productId, String name, String description, double price, String category) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    // Getters and Setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Methods
    public static List<Product> getAllProducts() {
        // Implement logic to fetch all products, for now returning dummy list
        List<Product> products = new ArrayList<>();
        products.add(new Product("1", "Product 1", "Description 1", 10.0, "Category 1"));
        products.add(new Product("2", "Product 2", "Description 2", 20.0, "Category 2"));
        return products;
    }

    public static Product getProductDetails(String productId) {
        // Implement logic to fetch a single product by productId, for now returning a dummy product
        return new Product(productId, "Product " + productId, "Description " + productId, 10.0 * Integer.parseInt(productId), "Category " + productId);
    }
}