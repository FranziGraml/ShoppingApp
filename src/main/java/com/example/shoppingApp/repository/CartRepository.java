package com.example.shoppingApp.repository;

import com.example.shoppingApp.entity.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart,Long> {
}
