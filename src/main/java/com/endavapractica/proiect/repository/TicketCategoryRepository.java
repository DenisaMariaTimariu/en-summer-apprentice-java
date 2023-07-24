package com.endavapractica.proiect.repository;

import com.endavapractica.proiect.model.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketCategoryRepository extends JpaRepository<TicketCategory,Integer> {
    //TicketCategory findByTicketCategoryIdAndEventId(Integer ticketCategoryId, Integer eventId);

   // TicketCategory findByTicketCategoryIdAndEventId(Integer ticketCategoryId, Integer eventId);
    @Query("SELECT t FROM TicketCategory t WHERE t.ticketCategoryId = :ticketCategoryId and t.eventId = :eventId" )
    TicketCategory findByTicketCategoryIdAndEventId(@Param("ticketCategoryId") Integer ticketCategoryId, @Param("eventId")Integer eventId);
}
