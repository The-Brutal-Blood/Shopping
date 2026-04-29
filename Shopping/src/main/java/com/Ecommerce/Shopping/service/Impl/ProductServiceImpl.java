package com.Ecommerce.Shopping.service.Impl;

import com.Ecommerce.Shopping.Entity.Product;
import com.Ecommerce.Shopping.Repository.ProductRepository;
import com.Ecommerce.Shopping.dto.ProductRequestDto;
import com.Ecommerce.Shopping.dto.ProductResponseDto;
import com.Ecommerce.Shopping.mapper.ProductMapper;
import com.Ecommerce.Shopping.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;


    public ProductResponseDto createProduct(ProductRequestDto dto){
    Product product = mapper.toEntity(dto);
    return mapper.toDto(repository.save(product));
}

   public List<ProductResponseDto> getAllProducts(){
        return repository.findAll()
                .stream().map(mapper::toDto).toList();

   }







}
