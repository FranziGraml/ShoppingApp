package com.example.shoppingApp.services;

import com.example.shoppingApp.entity.Cart;
import com.example.shoppingApp.entity.Product;
import com.example.shoppingApp.entity.ProductQuantity;
import com.example.shoppingApp.entity.User;
import com.example.shoppingApp.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartRepository cartRepository;

    public Cart getCart(User user) {
        return cartRepository.findCartByUser(user).orElse(null);
    }

    public Cart updateCart(User user, Product product, Integer quantity) {
        Cart cart = cartRepository.findCartByUser(user).orElse(new Cart(null, user, new ArrayList<>()));

       ProductQuantity productQuantity = cart.getItems().stream().filter((p)-> p.getProduct().equals(product)).findFirst().orElse(null);
        if (productQuantity != null) {
            if(quantity.equals(0)){
                cart.getItems().remove(productQuantity);
            }else {
                productQuantity.setQuantity(quantity);
            }
        } else {
            cart.getItems().add(new ProductQuantity(null, product, quantity));
            }
             return cartRepository.save(cart);

        }
}
