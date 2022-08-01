package com.nesterova.springeshop.service;

import com.nesterova.springeshop.dao.OrderRepository;
import com.nesterova.springeshop.domain.Order;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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

}
