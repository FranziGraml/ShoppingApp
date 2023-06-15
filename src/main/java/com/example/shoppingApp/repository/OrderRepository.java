package com.example.shoppingApp.repository;

import com.example.shoppingApp.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order,Long> {
}
