package com.nesterova.springeshop.service;

import com.nesterova.springeshop.dto.ProductDto;
import com.nesterova.springeshop.dto.UserDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getAll();
    void addToUserBucket(Long productId, String username);
    void addProduct(ProductDto dto);
}
