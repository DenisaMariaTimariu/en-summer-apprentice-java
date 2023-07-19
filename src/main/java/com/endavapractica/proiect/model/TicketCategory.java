package com.endavapractica.proiect.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class TicketCategory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long TicketCategoryId;

    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="price")
    private float price;

    public long getTicketCategoryId() {
        return TicketCategoryId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    public void setTicketCategoryId(long ticketCategoryId) {
        TicketCategoryId = ticketCategoryId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    TicketCategory(){

    }
}
