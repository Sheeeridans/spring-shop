package com.nesterova.springeshop.service;

import com.nesterova.springeshop.dao.OrderRepository;
import com.nesterova.springeshop.domain.Order;
import com.nesterova.springeshop.domain.User;
import com.nesterova.springeshop.dto.OrdersDto;
import com.nesterova.springeshop.dto.ProductDto;
import com.nesterova.springeshop.dto.UserDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    @Transactional
    public void saveOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public List<OrdersDto> getAll() {
        return orderRepository.findAll().stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    private OrdersDto toDto(Order order){
        return OrdersDto.builder()
                .id(order.getId())
                .created(order.getCreated())
                .updated(order.getUpdated())
                .sum(order.getSum())
                .user_id(order.getUser().getId())
                .build();
    }
}
