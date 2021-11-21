package com.ritesh.redis.springrediscache.reporsitory;

import com.ritesh.redis.springrediscache.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * @author Ritesh Rai
 * @version v1.0
 * @since v1.0
 * This class represents the order DAO
 */
@Repository
public class OrderReporsitory {

    private String HASH_KEY = "Order";
    @Autowired
    private RedisTemplate redisTemplate;

    public Order save(Order order) {
        redisTemplate.opsForHash().put(HASH_KEY, order.getOrderId(),order);
        return order;
    }

    public List<Order> findAll() {
        return redisTemplate.opsForHash().values(HASH_KEY);
    }

    public Order findByOrderId(long orderId) {
        return (Order) redisTemplate.opsForHash().get(HASH_KEY,orderId);
    }

    public String deleteOrder(long orderId) {
         redisTemplate.opsForHash().delete(HASH_KEY, orderId);
         return "record deleted!!!";
    }
}
