package com.example.shoppingApp.dto;

import com.example.shoppingApp.entity.User;
import com.example.shoppingApp.enumeration.ShippingState;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Date;

@Getter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor

public class OrderCreateDTO {
    @NotBlank
    private String user;

    //private Map<Product, Integer> items;

    private Boolean paid;
    private ShippingState shippingState;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
}

