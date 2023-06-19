package com.example.shoppingApp.repository;

import com.example.shoppingApp.entity.Cart;
import com.example.shoppingApp.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart,Long> {
    Cart findCartByUser(User user);
}
