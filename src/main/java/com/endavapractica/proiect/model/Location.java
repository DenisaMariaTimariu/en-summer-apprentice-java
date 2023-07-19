package com.endavapractica.proiect.model;

import jakarta.persistence.*;

import java.io.Serializable;

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

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getLocationId() {
        return locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    Location(){

    }
}
