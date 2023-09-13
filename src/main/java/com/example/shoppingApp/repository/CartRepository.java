package com.example.shoppingApp.repository;

import com.example.shoppingApp.entity.Cart;
import com.example.shoppingApp.entity.Order;
import com.example.shoppingApp.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CartRepository extends CrudRepository<Cart,Long> {

    /**
     *  CrudRepository ist eine Schnittstelle,
     *  die die grundlegende Repository-Schnittstelle erweitert
     *  und ihr generische CRUD-Methoden hinzufügt.
     *  Create
     *  Read
     *  Update
     *  Delete
     */

    Optional<Cart> findCartByUser(User user);
    //Cart findByOrder(Order order);
}
