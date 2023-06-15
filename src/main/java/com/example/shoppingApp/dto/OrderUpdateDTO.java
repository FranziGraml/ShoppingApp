package com.example.shoppingApp.dto;

import com.example.shoppingApp.entity.User;
import com.example.shoppingApp.enumeration.ShippingState;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Getter
@ToString
@RequiredArgsConstructor



public class OrderUpdateDTO {
    @NotBlank
    private Long id;
    @NotBlank
    private User user;
    @NotBlank
    private Number total;
    @NotBlank
    private Date date;
    @NotBlank
    private ShippingState shippingState;




}
