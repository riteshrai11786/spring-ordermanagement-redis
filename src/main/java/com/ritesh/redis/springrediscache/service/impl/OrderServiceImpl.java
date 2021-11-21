package com.ritesh.redis.springrediscache.service.impl;

import com.ritesh.redis.springrediscache.entity.Order;
import com.ritesh.redis.springrediscache.reporsitory.OrderReporsitory;
import com.ritesh.redis.springrediscache.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderReporsitory orderReporsitory;

    public Order save(Order order) {
        return orderReporsitory.save(order);
    }

    public List<Order> findAll() {
        return orderReporsitory.findAll();
    }

    public Order findByOrderId(long orderId) {
        return orderReporsitory.findByOrderId(orderId);
    }

    public String deleteOrder(long orderId) {
        return orderReporsitory.deleteOrder(orderId);
    }
}
