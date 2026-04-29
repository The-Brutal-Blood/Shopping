package com.Ecommerce.Shopping.dto;

import lombok.Data;

@Data
public class ProductRequestDto {
    private String name;
    private Double price;
    private String category;
    private Integer stock;
}
