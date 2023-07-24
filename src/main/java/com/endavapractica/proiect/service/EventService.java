package com.endavapractica.proiect.service;

import com.endavapractica.proiect.model.Event;

import java.util.List;

public interface EventService {

    public List <Event> getEvents(Integer id, String description);
}
