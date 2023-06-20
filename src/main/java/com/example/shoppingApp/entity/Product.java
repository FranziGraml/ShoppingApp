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

import java.util.Objects;

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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Objects.equals(getId(), product.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


}
