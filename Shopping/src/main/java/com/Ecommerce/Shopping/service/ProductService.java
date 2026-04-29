package com.Ecommerce.Shopping.service;

import com.Ecommerce.Shopping.dto.ProductRequestDto;
import com.Ecommerce.Shopping.dto.ProductResponseDto;

import java.util.List;

public interface ProductService {

    ProductResponseDto createProduct(ProductRequestDto dto);
    List<ProductResponseDto> getAllProducts();

}
