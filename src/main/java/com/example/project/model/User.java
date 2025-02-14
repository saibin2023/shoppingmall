package main.java.com.example.project.model;
import java.util.HashMap;
import java.util.Map;

public class User {
    private String username;
    private String password;
    private String email;
    private String address;

    // Constructor
    public User(String username, String password, String email, String address) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Methods
    public void login(String username, String password) {
        // Implement login logic here
        if ("admin".equals(username) && "admin".equals(password)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }

    public void register(String username, String password, String email, String address) {
        // Implement registration logic here
        Map<String, String> userData = new HashMap<>();
        userData.put("username", username);
        userData.put("password", password);
        userData.put("email", email);
        userData.put("address", address);

        System.out.println("User registered with data: " + userData);
    }

    public void updateProfile(String email, String address) {
        this.email = email;
        this.address = address;
        System.out.println("Profile updated with email: " + email + " and address: " + address);
    }
}