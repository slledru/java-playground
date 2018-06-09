package com.galvanize;

import java.time.LocalDateTime;

public class Order {
    private String orderNumber;
    private String name;
    private LocalDateTime createdDate;

    public Order(String orderNumber, String name) {
        this.orderNumber = orderNumber;
        this.name = name;
        this.createdDate = LocalDateTime.now();
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }
}
