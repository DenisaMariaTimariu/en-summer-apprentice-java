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
        Integer userId=Integer.valueOf(1);

        orderDTO.setCostumerId(order.getOrderId());
        orderDTO.setNumberOfTickets(order.getNumberOfTickets());
        orderDTO.setTicketCategoryId(order.getTicketcategoryId().getTicketCategoryId());
        orderDTO.setEventId(order.getTicketcategoryId().getEventId().getId());

        return orderDTO;

    }

    public Order DtoToEntity(OrderDTO orderDTO) {

        Order order = new Order();
        Integer userId=Integer.valueOf(1);

        order.setNumberOfTickets(orderDTO.getNumberOfTickets());

        return order;


    }
}
