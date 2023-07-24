package com.endavapractica.proiect.repository;

import com.endavapractica.proiect.model.EventType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventTypeRepository extends JpaRepository<EventType, Integer> {

    EventType findByName(String eventType);

}
