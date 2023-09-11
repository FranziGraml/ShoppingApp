package com.example.shoppingApp.entity;

import com.example.shoppingApp.enumeration.ShippingState;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor    //leerer Konstruktor (deault Konstruktor)
@AllArgsConstructor   // alle Argumente (Attribute) die im Konstruktor wären
@Getter
@Setter
@Entity

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //legt die ID als Primärschlüssel fest
    private Long id;
    @OneToOne

    private User user;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<ProductQuantity> items = new ArrayList<>();
    private Boolean paid;
    private ShippingState shippingState;
    @CreatedDate
    private Date date;


}
