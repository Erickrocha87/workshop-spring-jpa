package com.rochaerick.course.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rochaerick.course.entities.Order;
import com.rochaerick.course.entities.User;
import com.rochaerick.course.services.OrderService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> findAll(){
        List<Order> list = orderService.findAll();
        return list;
    }
    @GetMapping("/{id}")
    public Order findById(@PathVariable Long id){
       Order obj = orderService.findById(id);
        return obj;
    } 
    
}
