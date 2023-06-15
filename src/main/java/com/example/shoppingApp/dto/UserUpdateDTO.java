package com.example.shoppingApp.dto;

import com.example.shoppingApp.entity.Addresse;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;

@Getter
@ToString
@RequiredArgsConstructor
public class UserUpdateDTO {
    @NotNull
    @Positive
    private final Long id;
    @NotBlank
    private final String email;

    @NotBlank
    private final String firstname;

    @NotBlank
    private final String surname;

    private String password;
    @OneToOne
    private Addresse addresse;

}
