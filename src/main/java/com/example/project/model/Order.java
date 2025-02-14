package main.java.com.example.project.model;
import java.util.Date;
import java.util.List;

public class Order {
    private String orderId;
    private boolean delivered;
    private Date updatedAt;
    private double totalPrice;
    private double totalDiscount;
    private List<CartItem> cart;

    // Constructor
    public Order(String orderId, boolean delivered, Date updatedAt, double totalPrice, double totalDiscount, List<CartItem> cart) {
        this.orderId = orderId;
        this.delivered = delivered;
        this.updatedAt = updatedAt;
        this.totalPrice = totalPrice;
        this.totalDiscount = totalDiscount;
        this.cart = cart;
    }

    // Getters and Setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public List<CartItem> getCart() {
        return cart;
    }

    public void setCart(List<CartItem> cart) {
        this.cart = cart;
    }
}

class CartItem {
    private String productId;
    private String name;
    private String imgUrl;
    private double price;
    private double discount;

    // Constructor, Getters, and Setters
    public CartItem(String productId, String name, String imgUrl, double price, double discount) {
        this.productId = productId;
        this.name = name;
        this.imgUrl = imgUrl;
        this.price = price;
        this.discount = discount;
    }

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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}