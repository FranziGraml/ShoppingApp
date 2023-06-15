package com.example.shoppingApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor    //leerer Konstruktor (deault Konstruktor)
@AllArgsConstructor   // alle Argumente (Attribute) die im Konstruktor wären
@Getter
@Setter
@Entity              //Zeichnet die Klasse als Entität aus

public class User {
    @Id //legt die ID als Primärschlüssel fest
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // legt einen Wert fest und wird gespeichert (was soll die neue ID werden)
    private Long id;
    private String name;
    private String email;
    private String password;


}
