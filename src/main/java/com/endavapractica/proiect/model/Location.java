package com.endavapractica.proiect.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class Location implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long locationId;

    @Column(name="locationName")
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
