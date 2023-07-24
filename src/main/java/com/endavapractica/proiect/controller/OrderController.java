package com.endavapractica.proiect.controller;

import com.endavapractica.proiect.DTO.OrderDTO;
import com.endavapractica.proiect.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/order")
    public ResponseEntity<?> createOrder(@RequestBody OrderDTO orderDTO){
        return ResponseEntity.ok(orderService.createOrder(orderDTO));
    }
}
