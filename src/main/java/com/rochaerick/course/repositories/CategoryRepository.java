package com.rochaerick.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rochaerick.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

    
} 

