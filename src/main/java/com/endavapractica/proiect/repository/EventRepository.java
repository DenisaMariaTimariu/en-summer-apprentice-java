package com.endavapractica.proiect.repository;

import com.endavapractica.proiect.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {

    List <Event> findAllByid(Integer id);

}
