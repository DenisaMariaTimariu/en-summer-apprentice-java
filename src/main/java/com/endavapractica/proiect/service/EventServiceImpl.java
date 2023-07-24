package com.endavapractica.proiect.service;

import com.endavapractica.proiect.model.Event;
import com.endavapractica.proiect.model.EventType;
import com.endavapractica.proiect.repository.EventRepository;
import com.endavapractica.proiect.repository.EventTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService{

   private final EventRepository eventRepository;
   private final EventTypeRepository eventTypeRepository;

    public EventServiceImpl(EventRepository eventRepository, EventTypeRepository eventTypeRepository) {
        this.eventRepository = eventRepository;
        this.eventTypeRepository = eventTypeRepository;
    }


    @Override
    public List<Event> getEvents(Integer locationId, String eventType) {

        EventType eventType1=eventTypeRepository.findByName(eventType);

         return eventRepository.findAllByLocationId_locationIdAndEventTypeId_eventTypeId(locationId,eventType1.getEventTypeId());

    }
}
