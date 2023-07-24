package com.endavapractica.proiect.service;

import com.endavapractica.proiect.DTO.OrderDTO;
import com.endavapractica.proiect.model.Order;

import java.util.List;

public interface OrderService {

    public List<Order> findOrderByCostumerId(Integer costumer_id);

    public Order createOrder(OrderDTO orderDTO);

}
