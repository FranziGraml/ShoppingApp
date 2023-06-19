package com.example.shoppingApp.entity;

import com.example.shoppingApp.enumeration.ShippingState;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor    //leerer Konstruktor (deault Konstruktor)
@AllArgsConstructor   // alle Argumente (Attribute) die im Konstruktor wären
@Getter
@Setter
@Entity

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //legt die ID als Primärschlüssel fest
    private Long id;

    private String user;

    //private Map<Product, Integer> items;
    private Boolean paid;
    private ShippingState shippingState;

    private Date date;


}
