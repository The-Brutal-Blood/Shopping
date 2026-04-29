package com.Ecommerce.Shopping.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ProductResponseDto {
    private Long id;
    private String name;
    private Double price;
    private Integer stock;
    private String category;
    private LocalDateTime createdAt;
}
