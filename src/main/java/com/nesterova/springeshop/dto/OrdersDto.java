package com.nesterova.springeshop.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrdersDto {
    private Long id;
    private String status;
    private BigDecimal sum;
    private LocalDateTime created;
    private LocalDateTime updated;
    private Long user_id;
}
