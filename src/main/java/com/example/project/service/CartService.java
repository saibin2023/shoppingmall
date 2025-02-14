package main.java.com.example.project.service;

import com.example.model.CartItem;
import com.example.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public CartItem addToCart(CartItem cartItem) {
        return cartRepository.save(cartItem);
    }

    public CartItem removeFromCart(CartItem cartItem) {
        cartRepository.delete(cartItem);
        return cartItem;
    }
}
