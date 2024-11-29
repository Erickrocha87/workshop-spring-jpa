package com.rochaerick.course.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rochaerick.course.entities.Category;
import com.rochaerick.course.services.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired 
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        
        List<Category> entity = categoryService.findAll();
        return ResponseEntity.ok().body(entity);
        
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category entity = categoryService.findById(id);
        return ResponseEntity.ok().body(entity);
    }

}
