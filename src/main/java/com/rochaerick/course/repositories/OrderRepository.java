package com.rochaerick.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rochaerick.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
