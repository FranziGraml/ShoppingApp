package com.example.shoppingApp.repository;

import com.example.shoppingApp.entity.Order;
import com.example.shoppingApp.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order,Long> {
    List<Order> findAllByUser(User user);
}
