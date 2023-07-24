package com.endavapractica.proiect.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="TicketCategory")
public class TicketCategory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ticket_category_id")
    private Integer ticketCategoryId;


    @Column(name="description")
    private String description;

    @Column(name="price")
    private float price;


    @ManyToOne
    @JoinColumn(name="event_id")
    private Event eventId;


}
