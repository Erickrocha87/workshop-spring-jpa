package com.rochaerick.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.rochaerick.course.entities.OrderItem;




public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
