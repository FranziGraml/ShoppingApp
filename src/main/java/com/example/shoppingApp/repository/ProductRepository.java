package com.example.shoppingApp.repository;

import com.example.shoppingApp.entity.Product;
import com.example.shoppingApp.enumeration.Availability;
import com.example.shoppingApp.enumeration.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product,Long> {



    List<Product> findAllByCategory(Category category);

    List<Product> findAllByAvailable(Availability availability);


}
