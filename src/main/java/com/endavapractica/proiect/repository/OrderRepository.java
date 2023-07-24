package com.endavapractica.proiect.repository;

import com.endavapractica.proiect.model.Event;
import com.endavapractica.proiect.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {

    List<Order> findAllByuserId_userId(Integer id);




}
