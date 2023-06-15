package com.example.shoppingApp.enumeration;

public enum ShippingState {
    ENDING("Pending"),
    PROCESSING("Processing"),
    SHIPPED("Shipped"),
    DELIVERED("Delivered"),
    CANCELLED("Cancelled");

    private final String status;

    ShippingState(String status) {
        this.status = status;
    }

    public String getState() {
        return status;
    }
}
