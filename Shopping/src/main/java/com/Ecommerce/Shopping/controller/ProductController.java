package com.Ecommerce.Shopping.controller;

import com.Ecommerce.Shopping.dto.ProductRequestDto;
import com.Ecommerce.Shopping.dto.ProductResponseDto;
import com.Ecommerce.Shopping.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @PostMapping
    public ResponseEntity<ProductResponseDto> createProduct(@RequestBody ProductRequestDto dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createProduct(dto));
    }

    @GetMapping
    public ResponseEntity <List<ProductResponseDto>> getAllProducts(){
        return ResponseEntity.ok(service.getAllProducts());
    }




}
