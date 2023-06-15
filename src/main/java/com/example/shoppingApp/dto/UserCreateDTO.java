package com.example.shoppingApp.dto;

import com.example.shoppingApp.entity.Addresse;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class UserCreateDTO {

    @NotBlank
    private final String email;

    @NotBlank
    private final String firstname;

    @NotBlank
    private final String surname;

    private final String password;
    @OneToOne
    private final Addresse addresse;
}
