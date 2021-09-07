package com.ddd_design.orderexample.services;

import com.ddd_design.orderexample.entities.Order;
import com.ddd_design.orderexample.repositories.OrderRepository;
import com.ddd_design.orderexample.services.interfaces.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> getOrderHistory(Integer customerId) {

        return orderRepository.getCustomerOrderHistory(customerId);
    }

    @Override
    public List<Order> getOrdersTracking(Integer customerId) {

        return orderRepository.getCustomerUnfulFilledOrders(customerId);
    }

    @Override
    public List<Order> getOrdersPlacement(Integer customerId) {

        return orderRepository.getCustomerOrders(customerId);
    }
}
