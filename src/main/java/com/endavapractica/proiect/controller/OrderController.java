package com.endavapractica.proiect.controller;

import com.endavapractica.proiect.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders/{costumerId}")
    public ResponseEntity<?> getOrder (@PathVariable("costumerId") Integer costumer_id){
        return ResponseEntity.ok(orderService.findOrderByCostumerId(costumer_id));
    }
}
