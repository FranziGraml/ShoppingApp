package com.example.shoppingApp.dto;

import com.example.shoppingApp.enumeration.Availability;
import com.example.shoppingApp.enumeration.Category;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;

@Getter
@ToString
@RequiredArgsConstructor
public class ProductUpdateDTO {
    @NotNull
    @Positive
    private final Long id;
    @NotBlank
    private final String name;

    private final String description;

    private Float price;
    private Category category;

    private Availability available;
}
