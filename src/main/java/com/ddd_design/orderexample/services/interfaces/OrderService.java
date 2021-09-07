package com.ddd_design.orderexample.services.interfaces;

import com.ddd_design.orderexample.entities.Order;

import java.util.List;


public interface OrderService {
    List<Order> getOrderHistory(Integer customerId);

    List<Order> getOrdersTracking(Integer customerId);

    List<Order> getOrdersPlacement(Integer customerId);

}
