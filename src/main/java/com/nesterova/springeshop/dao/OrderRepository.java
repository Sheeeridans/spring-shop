package com.nesterova.springeshop.dao;

import com.nesterova.springeshop.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
