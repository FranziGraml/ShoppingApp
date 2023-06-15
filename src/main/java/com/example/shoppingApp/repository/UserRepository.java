package com.example.shoppingApp.repository;

import com.example.shoppingApp.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
