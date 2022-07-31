package com.nesterova.springeshop.service;

import com.nesterova.springeshop.domain.Bucket;
import com.nesterova.springeshop.domain.User;
import com.nesterova.springeshop.dto.BucketDto;

import java.util.List;

public interface BucketService {
    Bucket createBucket(User user, List<Long> productIds);

    void addProducts(Bucket bucket, List<Long> productIds);
    BucketDto getBucketByUser(String name);

}