package com.endavapractica.proiect.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CollectionId;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="Event")
public class Event implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="event_id")
    private Integer id;

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


    Event(){

    }


}
