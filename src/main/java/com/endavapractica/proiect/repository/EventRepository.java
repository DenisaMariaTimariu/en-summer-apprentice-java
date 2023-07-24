package com.endavapractica.proiect.repository;

import com.endavapractica.proiect.model.Event;
import com.endavapractica.proiect.model.EventType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {


   // List<Event> findAllByLocationId_locationIdAndEventTypeId_eventTypeId(Integer locationId, Integer eventTypeId);

    List<Event> findAllByLocationId_locationIdAndEventTypeId_eventTypeId(Integer locationId, Integer eventTypeId);
}
