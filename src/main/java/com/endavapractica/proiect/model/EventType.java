package com.endavapractica.proiect.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class EventType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long eventTypeId;

    @Column(name="name")
    private String name;

    public long getEventTypeId() {
        return eventTypeId;
    }

    public String getName() {
        return name;
    }

    public void setEventTypeId(long eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    EventType(){

    }
}
