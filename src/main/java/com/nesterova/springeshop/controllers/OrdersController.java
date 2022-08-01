package com.nesterova.springeshop.controllers;

import com.nesterova.springeshop.dto.ProductDto;
import com.nesterova.springeshop.service.OrderService;
import com.nesterova.springeshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {

    private final OrderService orderService;

    @Autowired
    public OrdersController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public String orderList(Model model){
        model.addAttribute("orders", orderService.getAll());
        return "orders";
    }
}
