package com.Ecommerce.Shopping.mapper;

import com.Ecommerce.Shopping.Entity.Product;
import com.Ecommerce.Shopping.dto.ProductRequestDto;
import com.Ecommerce.Shopping.dto.ProductResponseDto;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product toEntity(ProductRequestDto dto){
        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setStock(dto.getStock());
        product.setCategory(dto.getCategory());
        return product;
    }

    public ProductResponseDto toDto(Product product){
        return ProductResponseDto.builder()
                .id(product.getId())
                .name(product.getName())
                .category(product.getCategory())
                .price(product.getPrice())
                .createdAt(product.getCreateAt())
                .stock(product.getStock())
                .build();
    }
}
