package com.nesterova.springeshop.dao;

import com.nesterova.springeshop.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
