package main.java.com.example.project.controller;

import com.example.model.CartItem;
import com.example.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public ResponseEntity<CartItem> addToCart(@RequestBody CartItem cartItem) {
        CartItem addedItem = cartService.addToCart(cartItem);
        return ResponseEntity.ok(addedItem);
    }

    @PostMapping("/remove")
    public ResponseEntity<CartItem> removeFromCart(@RequestBody CartItem cartItem) {
        CartItem removedItem = cartService.removeFromCart(cartItem);
        return ResponseEntity.ok(removedItem);
    }
}
