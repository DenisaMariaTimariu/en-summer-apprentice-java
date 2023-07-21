package com.endavapractica.proiect.repository;

import com.endavapractica.proiect.model.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketCategoryRepository extends JpaRepository<TicketCategory,Integer> {
}
