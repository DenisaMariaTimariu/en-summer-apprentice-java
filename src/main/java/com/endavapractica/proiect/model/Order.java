package com.endavapractica.proiect.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name="Orders")
public class Order implements Serializable {
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
    @JoinColumn(name="user_id")
    private User userId;

    @ManyToOne
    @JoinColumn(name="ticket_category_id")
    private TicketCategory ticketcategoryId;


    Order(){

    }



}