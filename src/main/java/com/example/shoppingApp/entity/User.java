package com.example.shoppingApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@NoArgsConstructor    //leerer Konstruktor (deault Konstruktor)
@AllArgsConstructor   // alle Argumente (Attribute) die im Konstruktor wären
@Getter
@Setter
@Entity              //Zeichnet die Klasse als Entität aus

public class User implements UserDetails {
    @Id //legt die ID als Primärschlüssel fest
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // legt einen Wert fest und wird gespeichert (was soll die neue ID werden)
    private Long id;
    private  String firstname;
    private  String surname;
    private String email;
    private String password;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
