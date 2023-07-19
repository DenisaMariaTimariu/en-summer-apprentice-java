package com.endavapractica.proiect.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name="Orders")
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id")
    private long orderId;

    @Column(name="ordered_at")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime orderDate;


    @Column(name="number_of_tickets")
    private int numberOfTickets;

    @Column(name="total_price")
    private float totalPrice;

    @ManyToOne
    @Column(name="user_id")
    private User userId;

    @ManyToOne
    @Column(name="ticket_category_id")
    private TicketCategory ticketcategoryId;

    public long getOrderId() {
        return orderId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public User getUserId() {
        return userId;
    }

    public TicketCategory getTicketcategoryId() {
        return ticketcategoryId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public void setTicketcategoryId(TicketCategory ticketcategoryId) {
        this.ticketcategoryId = ticketcategoryId;
    }

    Orders(){

    }
}
