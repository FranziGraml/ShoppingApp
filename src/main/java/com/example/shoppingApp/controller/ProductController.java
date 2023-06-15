package com.example.shoppingApp.controller;


import com.example.shoppingApp.dto.ProductCreateDTO;
import com.example.shoppingApp.dto.ProductUpdateDTO;
import com.example.shoppingApp.entity.Product;
import com.example.shoppingApp.services.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    private final ModelMapper modelMapper;

    //Post
    @PostMapping
    //@PreAuthorize("hasRole('PRODUCT_CREATE')")
    public ResponseEntity<Product> createProduct(@Valid @RequestBody ProductCreateDTO productCreateDTO){
        return new ResponseEntity<>(this.productService.createProduct(modelMapper.map(productCreateDTO, Product.class)), CREATED );
    }
    @PutMapping
    //@PreAuthorize("hasRole('PRODUCT_UPDATE')")
    public Product updateProduct(@Valid @RequestBody ProductUpdateDTO productUpdateDTO){
        Product product = this.productService.getProductById(productUpdateDTO.getId());
        modelMapper.map(productUpdateDTO, product);
        return this.productService.updateProduct(product);
    }

    //Delete
    @DeleteMapping("/{id}")
    //@PreAuthorize(value = "hasRole('PRODUCT_DELETE')")
    public void deleteProduct(@PathVariable("id")Long id){
        this.productService.deleteProduct(id);
    }

    @GetMapping
    //@PreAuthorize("hasRole('PRODUCT_READ_ALL')")
    public List<Product> getAllProducts() {
        return this.productService.getAllProducts();
    }

    @GetMapping("/{id}")
    //@PreAuthorize("hasRole('PRODUCT_READ_ALL BY PRODUCT ID')")
    public Product getProductById(@PathVariable("id") Long id) {
        return this.productService.getProductById(id);
    }











}


