package com.endavapractica.proiect.service;

import com.endavapractica.proiect.model.Order;
import com.endavapractica.proiect.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> findOrderByCostumerId(Integer costumer_id) {

       List<Order> order =orderRepository.findAllByuserId_userId(costumer_id);
        return order;
    }
}
