package com.ritesh.redis.springrediscache.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;

import java.io.Serializable;
import java.util.List;

/**
 * @author Ritesh Rai
 * @version v1.0
 * @since v1.0
 * This class represents the order entity, I love writing Java doc :)
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@RedisHash("Order")
public class Order extends JdkSerializationRedisSerializer implements Serializable {

    @Id
    private long orderId;
    private String orderDesc;
    private String orderType;
    private String orderedBy;
    private List<String> products;
}
