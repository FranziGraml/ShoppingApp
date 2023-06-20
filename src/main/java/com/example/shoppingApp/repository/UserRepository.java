package com.example.shoppingApp.repository;

import com.example.shoppingApp.entity.User;
import jakarta.validation.constraints.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String Email);
}
