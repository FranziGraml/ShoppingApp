package com.example.shoppingApp.dto;

import com.example.shoppingApp.entity.User;
import com.example.shoppingApp.enumeration.ShippingState;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

@Getter
@ToString
@RequiredArgsConstructor



public class OrderUpdateDTO {
    @NotNull
    @Positive
    private final Long id;
    @NotNull
    private final Boolean status= false;

    @NotBlank
    private final String user;

    //private Map<Product, Integer> items;
    private Boolean paid;
    private ShippingState shippingState;

    private Date date;



}
