package com.endavapractica.proiect.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="EventType")
public class EventType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="event_type_id")
    private long eventTypeId;

    @Column(name="event_type_name")
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
