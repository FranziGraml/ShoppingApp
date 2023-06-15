package com.example.shoppingApp.database;

import com.example.shoppingApp.enumeration.Availability;
import com.example.shoppingApp.enumeration.Category;
import com.example.shoppingApp.repository.AddressRepository;
import com.example.shoppingApp.repository.ProductRepository;
import com.example.shoppingApp.repository.UserRepository;
import com.example.shoppingApp.entity.Addresse;
import com.example.shoppingApp.entity.Product;
import com.example.shoppingApp.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
@RequiredArgsConstructor

public class DatabasePopulator implements CommandLineRunner {
    @Autowired
    private final ProductRepository productRepository;
    @Autowired
    private final AddressRepository addressRepository;
    @Autowired
    private final UserRepository userRepository;


    @Override
    public void run (String...args) throws Exception{
        Addresse addresse1 = new Addresse(null,"Germany","84100","Landshut","Adler","10");
        addressRepository.save(addresse1);

        final User user1 = new User(null,"Franzi","f.hhh@dfd.de","1111");
        final User user2 = new User(null,"Maxi","f.hhh@hallo.de","1551");

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.findAll();

        final Product product1 = new Product(null,"Hemd",20F, Category.CLOTHING, Availability.AVAILABLE);
        final Product product2 = new Product(null,"Hose",25F,Category.CLOTHING,Availability.AVAILABLE);
        final Product product3 = new Product(null,"shirt",40F,Category.CLOTHING,Availability.LIMITED_STOCK);
        productRepository.save(product1);
        productRepository.save(product2);
        productRepository.save(product3);



    }



}
