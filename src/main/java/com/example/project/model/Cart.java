package main.java.com.example.project.model;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cart {
    private List<CartItem> cartItems;
    private int totalItems;
    private double totalPrice;
    private double totalDiscount;

    public Cart() {
        this.cartItems = new ArrayList<>();
        this.totalItems = 0;
        this.totalPrice = 0;
        this.totalDiscount = 0;
    }

    public void addToCart(CartItem item) {
        for (CartItem cartItem : cartItems) {
            if (cartItem.getProductID().equals(item.getProductID()) &&
                cartItem.getColor().equals(item.getColor()) &&
                cartItem.getSize().equals(item.getSize())) {
                cartItem.setQuantity(cartItem.getQuantity() + 1);
                updateTotals();
                return;
            }
        }
        item.setItemID(UUID.randomUUID().toString());
        cartItems.add(item);
        updateTotals();
    }

    public void removeFromCart(String itemID) {
        cartItems.removeIf(item -> item.getItemID().equals(itemID));
        updateTotals();
    }

    public void increaseQuantity(String itemID) {
        for (CartItem cartItem : cartItems) {
            if (cartItem.getItemID().equals(itemID)) {
                cartItem.setQuantity(cartItem.getQuantity() + 1);
                updateTotals();
                return;
            }
        }
    }

    public void decreaseQuantity(String itemID) {
        for (CartItem cartItem : cartItems) {
            if (cartItem.getItemID().equals(itemID)) {
                cartItem.setQuantity(cartItem.getQuantity() - 1);
                updateTotals();
                return;
            }
        }
    }

    public void clearCart() {
        cartItems.clear();
        totalItems = 0;
        totalPrice = 0;
        totalDiscount = 0;
    }

    private void updateTotals() {
        totalItems = cartItems.stream().mapToInt(CartItem::getQuantity).sum();
        totalPrice = cartItems.stream().mapToDouble(item -> item.getQuantity() * item.getPrice()).sum();
        totalDiscount = cartItems.stream().mapToDouble(item -> item.getQuantity() * item.getDiscount()).sum();
    }

    // Getters for totalItems, totalPrice, totalDiscount, and cartItems
    public int getTotalItems() {
        return totalItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }
}

class CartItem {
    private String itemID;
    private String productID;
    private String name;
    private double price;
    private double discount;
    private int quantity;
    private String color;
    private String size;

    // Constructor, getters, and setters
    public CartItem(String productID, String name, double price, double discount, String color, String size) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.quantity = 1; // default quantity
        this.color = color;
        this.size = size;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}