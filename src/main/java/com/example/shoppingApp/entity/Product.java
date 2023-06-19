package com.example.shoppingApp.entity;

import com.example.shoppingApp.enumeration.Availability;
import com.example.shoppingApp.enumeration.Category;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor    //leerer Konstruktor (deault Konstruktor)
@AllArgsConstructor   // alle Argumente (Attribute) die im Konstruktor wären
@Getter
@Setter
@Entity              //Zeichnet die Klasse als Entität aus

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //legt die ID als Primärschlüssel fest
    private Long id;
    private String name;
    private  String description;
    private Float price;
    private Category category;
    private Availability available;

}
