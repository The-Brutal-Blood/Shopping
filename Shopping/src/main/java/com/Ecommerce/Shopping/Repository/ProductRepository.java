package com.Ecommerce.Shopping.Repository;

import com.Ecommerce.Shopping.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAll();


}

