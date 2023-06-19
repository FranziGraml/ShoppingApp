package com.example.shoppingApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor    //leerer Konstruktor (deault Konstruktor)
@AllArgsConstructor   // alle Argumente (Attribute) die im Konstruktor wären
@Getter
@Setter
@Entity              //Zeichnet die Klasse als Entität aus

public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //legt die ID als Primärschlüssel fest
    private Long id;
    @OneToOne
    private User user;
    @ElementCollection
    //@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Map<Product,Integer> items = new HashMap<>();


}
