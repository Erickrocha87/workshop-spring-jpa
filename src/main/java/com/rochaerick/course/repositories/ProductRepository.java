package com.rochaerick.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rochaerick.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

    
}