package com.example.shoppingApp.entity;

import com.example.shoppingApp.enumeration.Availability;
import com.example.shoppingApp.enumeration.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor    //leerer Konstruktor (deault Konstruktor)
@AllArgsConstructor   // alle Argumente (Attribute) die im Konstruktor wären
@Getter
@Setter
@Entity
public class ProductQuantity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //legt die ID als Primärschlüssel fest
    private Long id;
    @OneToOne
    private Product product;
    private Integer quantity;


}
