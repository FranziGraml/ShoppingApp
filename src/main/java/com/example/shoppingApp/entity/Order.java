package com.example.shoppingApp.entity;

import com.example.shoppingApp.enumeration.ShippingState;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor    //leerer Konstruktor (deault Konstruktor)
@AllArgsConstructor   // alle Argumente (Attribute) die im Konstruktor wären
@Getter
@Setter


public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //legt die ID als Primärschlüssel fest
    private Long id;
    private User user;
    private Number total;
    private Date date;
    private ShippingState shippingState;

}
