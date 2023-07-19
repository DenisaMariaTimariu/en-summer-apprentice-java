package com.endavapractica.proiect.model;

import jakarta.persistence.*;

import java.io.Serializable;

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
    @Column(name="event_id")
    private Event eventId;

    public long getTicketCategoryId() {
        return TicketCategoryId;
    }


    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }
    public Event getEventId() {
        return eventId;
    }


    public void setTicketCategoryId(long ticketCategoryId) {
        TicketCategoryId = ticketCategoryId;
    }



    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public void setEventId(Event eventId) {
        this.eventId = eventId;
    }
    TicketCategory(){

    }
}
