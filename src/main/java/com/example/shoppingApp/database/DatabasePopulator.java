package com.example.shoppingApp.database;

import com.example.shoppingApp.entity.Order;
import com.example.shoppingApp.enumeration.Availability;
import com.example.shoppingApp.enumeration.Category;
import com.example.shoppingApp.enumeration.ShippingState;
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

import java.text.DateFormat;


@Component
@RequiredArgsConstructor

public class DatabasePopulator implements CommandLineRunner {
    @Autowired
    private final ProductRepository productRepository;
    @Autowired
    private final AddressRepository addressRepository;
    @Autowired
    private final UserRepository userRepository;

    /**
     *Befüllung der Datenbank mit Demo Werten
     */
    @Override
    public void run (String...args) throws Exception{
        Addresse addresse1 = new Addresse(null,"Germany","84100","Landshut","Adler","10");
        addressRepository.save(addresse1);

        final User user1 = new User(null,"Franzi","Graml","f.muster.de","1111");
        final User user2 = new User(null,"Maxi","Graml","m.muster.de","1551");

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.findAll();

        final Product product1 = new Product(null,"IPhone","Space schwarz",350F,Category.ELECTRONICS,Availability.LIMITED_STOCK);
        final Product product2 = new Product(null,"MaxZone","Digitaler Gutschein",50F,Category.CLOTHING,Availability.LIMITED_STOCK);
        final Product product3 = new Product(null,"Das fliegende Klassenzimmer","Kinderbuch",35F,Category.BOOKS,Availability.LIMITED_STOCK);
        productRepository.save(product1);
        productRepository.save(product2);
        productRepository.save(product3);

    }



}
