package com.ritesh.redis.springrediscache.controller;

import com.ritesh.redis.springrediscache.entity.Order;
import com.ritesh.redis.springrediscache.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ritesh Rai
 * @version v1.0
 * @since v1.0
 * This class represents the order REST controller
 */
@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public Order createOrder(@RequestBody Order order) {
        return orderService.save(order);
    }

    @GetMapping("/findAll")
    public List<Order> getAllOrders() {
        return orderService.findAll();
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable long id) {
        return orderService.findByOrderId(id);
    }

    @DeleteMapping("/{id}")
    public String remove(@PathVariable long id) {
        return orderService.deleteOrder(id);
    }
}
