package com.example.shoppingApp.services;

import com.example.shoppingApp.entity.Cart;
import com.example.shoppingApp.entity.Order;
import com.example.shoppingApp.entity.ProductQuantity;
import com.example.shoppingApp.entity.User;
import com.example.shoppingApp.repository.CartRepository;
import com.example.shoppingApp.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final UserService userService;
    private final CartRepository cartRepository;
    /**
     *Gibt alle Bestellungen zurück die in der Datenbank gespeichert sind
     */
    public List<Order> getAllOrders() {
        return (List<Order>) orderRepository.findAll();
    }

    /**
     *Gibt nur die Besttlung zurück die eine gewisse ID hat
     */
    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }
    /**
     *Fügt eine neue Bestellung hinzu
     */
    public Order createOrder(Order order) {
        Cart cart = cartRepository.findCartByUser(order.getUser()).orElse(null);
        this.cartRepository.delete(cart);
        return orderRepository.save(order);
    }
    /**
     *Überprüft ale vorhandenen Bestellung in der Datenbank
     */
    public Order updateOrder(Order order) {
        return orderRepository.save(order);
    }
    /**
     *löscht eine Bestellung
     */
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

    public List<Order> getOrdersByUserId(Long id) {
        User user = this.userService.getUserById(id);
        return orderRepository.findAllByUser(user);
    }
    public List<ProductQuantity> getItemsByUser(User user) {
        Cart cart = cartRepository.findCartByUser(user).orElse(null);
        ArrayList<ProductQuantity> products = new ArrayList<>();
        for (ProductQuantity productQuantity : cart.getItems()){
            products.add(new ProductQuantity(null,productQuantity.getProduct(),productQuantity.getQuantity()));
        }

        return products;
    }

}

