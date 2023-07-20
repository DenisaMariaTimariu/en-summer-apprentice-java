package com.endavapractica.proiect.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="TicketCategory")
public class TicketCategory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ticket_category_id")
    private long TicketCategoryId;


    @Column(name="description")
    private String description;
    @Column(name="price")
    private float price;


    @ManyToOne
    @JoinColumn(name="event_id")
    private Event eventId;

    TicketCategory(){

    }
}
