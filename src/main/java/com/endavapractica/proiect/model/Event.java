package com.endavapractica.proiect.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CollectionId;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name="Event")
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="event_id")
    private long id;

    @Column(name="event_name")
    private String name;
    @Column(name="event_description")
    private String description;
    @Column(name="start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime startDate;
    @Column(name="end_date")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime endDate;

    @ManyToOne
    @JoinColumn(name="location_id")
    private Location locationId;

    @ManyToOne
    @JoinColumn(name="event_type_id")
    private EventType eventTypeId;





    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public Location getLocationId() {
        return locationId;
    }

    public EventType getEventTypeId() {
        return eventTypeId;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
    public void setLocationId(Location locationId) {
        this.locationId = locationId;
    }

    public void setEventTypeId(EventType eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    Event(){

    }


}
