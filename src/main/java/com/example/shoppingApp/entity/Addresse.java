package com.example.shoppingApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor    //leerer Konstruktor (deault Konstruktor)
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Addresse {
    @Id //legt die ID als Primärschlüssel fest
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // legt einen Wert fest und wird gespeichert (was soll die neue ID werden)

    private Long id;
    private String country;
    private String postalcode;
    private String city;
    private String street;
    private String houseNumber;
}
