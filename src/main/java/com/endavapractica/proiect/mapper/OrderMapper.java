package com.endavapractica.proiect.mapper;

import com.endavapractica.proiect.DTO.OrderDTO;
import com.endavapractica.proiect.model.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {


    public OrderDTO mapToDTO(Order order) {

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setCostumerId(order.getOrderId());
        orderDTO.setNumberOfTickets(order.getNumberOfTickets());
        orderDTO.setTicketCategoryId(order.getTicketcategoryId().getTicketCategoryId());

        return orderDTO;

    }

    public Order mapToEntity(OrderDTO orderDTO){

        Order order =new Order();

        order.setUserId(orderDTO.getCostumerId());
        order.setNumberOfTickets(orderDTO.getNumberOfTickets());
        order.setTicketcategoryId(orderDTO.getTicketCategoryId());
        return order;
    }
}
