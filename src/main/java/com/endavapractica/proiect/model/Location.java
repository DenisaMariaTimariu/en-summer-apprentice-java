package com.endavapractica.proiect.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="Location")
public class Location implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="location_id")
    private long locationId;

    @Column(name="location_name")
    private String locationName;

    @Column(name="capacity")
    private int capacity;

    @Column(name="type")
    private String type;

    Location(){

    }
}
