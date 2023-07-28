package com.endavapractica.proiect.mapper;

import com.endavapractica.proiect.DTO.OrderDTO;
import com.endavapractica.proiect.model.Order;
import com.endavapractica.proiect.model.TicketCategory;
import com.endavapractica.proiect.model.User;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {


    public OrderDTO EntityToDto(Order order) {

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setCostumerId(order.getOrderId());
        orderDTO.setNumberOfTickets(order.getNumberOfTickets());
        orderDTO.setTicketCategoryId(order.getTicketcategoryId().getTicketCategoryId());
        orderDTO.setEventId(order.getTicketcategoryId().getEventId().getId());

        return orderDTO;

    }

    public Order DtoToEntity(OrderDTO orderDTO) {

        Order order = new Order();

        order.setNumberOfTickets(orderDTO.getNumberOfTickets());

        User user = new User();
        user.setUserId(orderDTO.getCostumerId());
        order.setUserId(user);

        TicketCategory ticketCategory = new TicketCategory();
        ticketCategory.setTicketCategoryId(orderDTO.getTicketCategoryId());
        order.setTicketcategoryId(ticketCategory);



        return order;


    }
}
