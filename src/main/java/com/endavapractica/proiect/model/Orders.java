package com.endavapractica.proiect.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;

    @Column(name="orderDate")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime orderedAt;
    @Column(name="numberOfTickets")
    private int numberOfTickets;

    @Column(name="totalPrice")
    private float totalPrice;

    public long getOrderId() {
        return orderId;
    }

    public LocalDateTime getOrderedAt() {
        return orderedAt;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public void setOrderedAt(LocalDateTime orderedAt) {
        this.orderedAt = orderedAt;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    Orders(){

    }
}
