package com.endavapractica.proiect.service;

import com.endavapractica.proiect.DTO.OrderDTO;
import com.endavapractica.proiect.mapper.OrderMapper;
import com.endavapractica.proiect.model.Order;
import com.endavapractica.proiect.model.TicketCategory;
import com.endavapractica.proiect.model.User;
import com.endavapractica.proiect.repository.EventRepository;
import com.endavapractica.proiect.repository.OrderRepository;
import com.endavapractica.proiect.repository.TicketCategoryRepository;
import com.endavapractica.proiect.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;
    private final UserRepository userRepository;
    private final TicketCategoryRepository ticketCategoryRepository;
    private  final EventRepository eventRepository;
    private final OrderMapper orderMapper;
    public OrderServiceImpl(OrderRepository orderRepository, UserRepository userRepository, TicketCategoryRepository ticketCategoryRepository, EventRepository eventRepository, OrderMapper orderMapper) {
        this.orderRepository = orderRepository;
        this.userRepository = userRepository;
        this.ticketCategoryRepository = ticketCategoryRepository;
        this.eventRepository = eventRepository;
        this.orderMapper = orderMapper;
    }

    @Override
    public List<Order> findOrderByCostumerId(Integer costumer_id) {

       List<Order> order =orderRepository.findAllByuserId_userId(costumer_id);
        return order;
    }

    @Override
    public Order createOrder(OrderDTO orderDTO) {

        Order order = orderMapper.DtoToEntity(orderDTO);

        User user = userRepository.findById(orderDTO.getCostumerId()).orElse(null);
        TicketCategory ticketCategory = ticketCategoryRepository.findById(orderDTO.getTicketCategoryId()).orElse(null);

        order.setUserId(user);
        order.setTicketcategoryId(ticketCategory);

        ZoneId defaultZoneId = ZoneId.systemDefault();
        LocalDate now = LocalDate.now();
        Date date = Date.from(now.atStartOfDay(defaultZoneId).toInstant());

        order.setOrderDate(date);

        TicketCategory ticketCategory1 = ticketCategoryRepository.findByTicketCategoryIdAndEventId(orderDTO.getTicketCategoryId(),orderDTO.getEventId());

        float totalPrice=ticketCategory1.getPrice()*orderDTO.getNumberOfTickets();
        order.setTotalPrice(totalPrice);
        order.setTicketcategoryId(ticketCategory1);

        orderRepository.save(order);

        return null;
    }


}
