package com.nesterova.springeshop.service;

import com.nesterova.springeshop.domain.Order;
import com.nesterova.springeshop.dto.OrdersDto;
import com.nesterova.springeshop.dto.ProductDto;
import com.nesterova.springeshop.dto.UserDto;

import java.util.List;

public interface OrderService {
    void saveOrder(Order order);

   List<OrdersDto> getAll();
}
