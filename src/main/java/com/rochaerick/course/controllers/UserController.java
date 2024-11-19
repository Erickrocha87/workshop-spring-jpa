package com.rochaerick.course.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rochaerick.course.entities.User;

@RestController
@RequestMapping("/users")
public class UserController {


    @GetMapping
     public ResponseEntity<User> findAll() {
        User user = new User(1L, "Erick", "erick@gmail.com", "519999999", "ae3r5dd5SF");
        return ResponseEntity.ok().body(user);
    }
}
