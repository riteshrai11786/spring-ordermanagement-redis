package com.ritesh.redis.springrediscache.service;

import com.ritesh.redis.springrediscache.entity.Order;
import com.ritesh.redis.springrediscache.reporsitory.OrderReporsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrderService {

    public Order save(Order order);

    public List<Order> findAll();

    public Order findByOrderId(long orderId);

    public String deleteOrder(long orderId);
}
