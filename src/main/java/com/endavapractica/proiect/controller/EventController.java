package com.endavapractica.proiect.controller;

import com.endavapractica.proiect.service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/orders/{locationId}/{eventType}")
    public ResponseEntity<?> getEvents (@PathVariable("location/eventType") Integer location_id, String event_type){
        return ResponseEntity.ok(eventService.getEvents(location_id,event_type));
    }
}
