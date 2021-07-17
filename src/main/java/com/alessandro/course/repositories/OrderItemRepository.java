package com.alessandro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alessandro.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
