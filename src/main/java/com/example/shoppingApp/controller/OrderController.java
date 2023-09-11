package com.example.shoppingApp.controller;

import com.example.shoppingApp.entity.Order;

import com.example.shoppingApp.entity.User;
import com.example.shoppingApp.enumeration.ShippingState;
import com.example.shoppingApp.services.OrderService;
import com.example.shoppingApp.dto.OrderUpdateDTO;
import com.example.shoppingApp.services.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final ModelMapper modelMapper;
    private final UserService userService;

    @GetMapping
    //@PreAuthorize(value = "hasRole('ORDER_READ_ALL')")
    public List<Order> getAllOrders() {
        return this.orderService.getAllOrders();
    }

    @PostMapping
    //@PreAuthorize("hasRole('ORDER_CREATE')")
        private ResponseEntity<Order> createOrder (@AuthenticationPrincipal User user){
        Order newOrder = new Order(null,user, this.orderService.getItemsByUser(user),false, ShippingState.ENDING,null);
            return new ResponseEntity<>(this.orderService.createOrder(newOrder), HttpStatus.CREATED);
        }


        @PutMapping
        //@PreAuthorize("hasRole('ORDER_UPDATE')")
        public Order updateOrder (@Valid @RequestBody OrderUpdateDTO orderUpdateDTO){
            Order order = this.orderService.getOrderById(orderUpdateDTO.getId());
            modelMapper.map(orderUpdateDTO, order);
            return this.orderService.updateOrder(order);
        }

        @DeleteMapping("/{id}")
        //@PreAuthorize("hasRole('ORDER_DELETE')")
        public void deleteOrder (@PathVariable("id") Long id){
            this.orderService.deleteOrder(id);
        }


        @GetMapping("/user/{id}")
        //@PreAuthorize("hasRole('ORDER_READ_ALL BY USER ID')")
        public List<Order> getOrdersByUserId (@PathVariable("id") Long id){
            return this.orderService.getOrdersByUserId(id);
        }

        @GetMapping("/{id}")
        //@PreAuthorize("hasRole('ORDER_READ_ALL BY ORDER ID')")
        public Order getOrderById (@PathVariable("id") Long id){
            return this.orderService.getOrderById(id);
        }
    }
