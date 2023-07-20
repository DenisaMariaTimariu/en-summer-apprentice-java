package com.endavapractica.proiect.controller;

import com.endavapractica.proiect.model.Event;
import com.endavapractica.proiect.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class EventController {

    @Autowired
    EventRepository eventRepository;

    @GetMapping("/events")
    public ResponseEntity<List<Event>> getAllEvents(@RequestParam(required = false) Integer EventID){
        try{
            List<Event> events = new ArrayList<>();
            if(EventID == null)
                eventRepository.findAll().forEach(events::add);
            else
                eventRepository.findAllByid(EventID).forEach(events::add);

            if(events.isEmpty())
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            return new ResponseEntity<>(events, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
