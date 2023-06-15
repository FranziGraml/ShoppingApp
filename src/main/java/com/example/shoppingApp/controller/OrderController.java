package com.example.shoppingApp.controller;

import com.example.shoppingApp.entity.Order;
import com.example.shoppingApp.services.OrderService;
import dto.OrderCreateDTO;
import dto.OrdertUpdateDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shopping")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final ModelMapper modelMapper;

    @GetMapping
    //@PreAuthorize(value = "hasRole('ORDER_READ_ALL')")
    public List<Order> getAllOrders() {
        return this.orderService.getAllOrders();
    }
    @GetMapping("/{id}")
    //@PreAuthorize("hasRole('ORDER_READ_ALL BY ORDER ID')")
    public Order getOrderById(@PathVariable("id") Long id) {
        return this.orderService.getOrderById(id);
    }

    @PostMapping
    //@PreAuthorize("hasRole('ORDER_CREATE')")
    public ResponseEntity<Order> createOrder(@Valid @RequestBody OrderCreateDTO orderCreateDTO) {
        return new ResponseEntity<>(this.orderService.createOrder(modelMapper.map(orderCreateDTO, Order.class)), HttpStatus.CREATED);
    }

    @PutMapping
    //@PreAuthorize("hasRole('ORDER_UPDATE')")
    public Order updateOrder(@Valid @RequestBody OrdertUpdateDTO orderUpdateDTO) {
        Order order = this.orderService.getOrderById(orderUpdateDTO.getId());
        modelMapper.map(orderUpdateDTO, order);
        return this.orderService.updateOrder(order);
    }

    @DeleteMapping("/{id}")
    //@PreAuthorize("hasRole('ORDER_DELETE')")
    public void deleteOrder(@PathVariable("id") Long id) {
        this.orderService.deleteOrder(id);
    }


    @GetMapping("/{id}")
    //@PreAuthorize("hasRole('ORDER_READ_ALL BY USER ID')")
    public List<Order> getOrdersByUserId(@PathVariable("id") Long id) {
        return this.orderService.getOrdersByUserId(id);
    }
}
