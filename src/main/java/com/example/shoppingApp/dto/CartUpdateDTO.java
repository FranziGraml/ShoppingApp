package com.example.shoppingApp.dto;

import com.example.shoppingApp.entity.Product;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

    @Getter
    @ToString
    @RequiredArgsConstructor

    public class CartUpdateDTO {

        @NotNull
        private Product product;

        @NotNull
        private Integer quantity;

    }

