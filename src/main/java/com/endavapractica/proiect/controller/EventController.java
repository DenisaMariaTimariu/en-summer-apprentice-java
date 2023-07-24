package com.endavapractica.proiect.controller;

import com.endavapractica.proiect.model.Event;
import com.endavapractica.proiect.service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/events/{locationId}/{eventType}")
    public ResponseEntity<?> getEvents (@PathVariable Integer locationId, @PathVariable String eventType){
        List<Event> events = eventService.getEvents(locationId,eventType);
        return ResponseEntity.ok(events);
    }
}
