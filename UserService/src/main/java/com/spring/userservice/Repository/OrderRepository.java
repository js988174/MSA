package com.spring.userservice.Repository;

import com.spring.userservice.entity.OrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderEntity, Long> {

    OrderEntity findByOrderId(String productId);

    Iterable<OrderEntity> findByUerId(String userId);
}
