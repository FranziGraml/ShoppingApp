package com.example.shoppingApp.controller;

import com.example.shoppingApp.dto.CartUpdateDTO;
import com.example.shoppingApp.entity.Cart;
import com.example.shoppingApp.entity.User;
import com.example.shoppingApp.services.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @GetMapping
    @PreAuthorize("hasRole('READ Cart')")
    public Cart getCart(@AuthenticationPrincipal User user) {
        return this.cartService.getCart(user);
    }

    @PutMapping()
    @PreAuthorize("hasRole('UPDATE Cart')")
    public Cart updateCart(@AuthenticationPrincipal User user, @RequestBody CartUpdateDTO cartUpdateDTO)  {
        return this.cartService.updateCart(user, cartUpdateDTO.getProduct(), cartUpdateDTO.getQuantity());
    }








}
