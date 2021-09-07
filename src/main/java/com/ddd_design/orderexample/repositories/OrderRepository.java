package com.ddd_design.orderexample.repositories;

import com.ddd_design.orderexample.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {

    List<Order> getCustomerOrders(Integer customerId);

    List<Order> getCustomerOrderHistory(Integer customerId);

    List<Order> getCustomerUnfulFilledOrders(Integer customerId);
}