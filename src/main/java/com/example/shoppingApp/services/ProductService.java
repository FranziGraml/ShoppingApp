package com.example.shoppingApp.services;

import com.example.shoppingApp.enumeration.Availability;
import com.example.shoppingApp.enumeration.Category;
import com.example.shoppingApp.repository.ProductRepository;
import com.example.shoppingApp.entity.Product;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service        // leitet die Anfragen an das Repo weiter

public class ProductService {

    private final ProductRepository productRepository;

    //Create
    public Product createProduct(Product product) {
        productRepository.save(product);

        return product;
    }
    public Product updateProduct(Product product) {
        Product updateProduct = productRepository.findById(product.getId()).orElseThrow(
                () -> new EntityNotFoundException("Not found"));
        updateProduct.setName(product.getName());
        updateProduct.setDescription(product.getDescription());
        updateProduct.setPrice(product.getPrice());
        updateProduct.setAvailable(product.getAvailable());
        updateProduct.setCategory(product.getCategory());
        this.productRepository.save(updateProduct);
        return updateProduct;
    }


    //Delete
    public void deleteProduct(Long Id) {
        productRepository.deleteById(Id);
    }

    //Read
    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow();
    }

    /*public List<Product> getProductsByCategory(Category category) {
        return productRepository.findAllByCategory(category);
    }
    public List<Product> getProductsByAvailability(Availability availability) {
        return productRepository.findAllByAvailable(availability);
    }

     */
}





