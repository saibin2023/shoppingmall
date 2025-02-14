package main.java.com.example.project.dto;

import java.util.List;

public class OrderDto {
    private Long id;
    private Long userId;
    private List<CartDto> items;
    private double total;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<CartDto> getItems() {
        return items;
    }

    public void setItems(List<CartDto> items) {
        this.items = items;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
