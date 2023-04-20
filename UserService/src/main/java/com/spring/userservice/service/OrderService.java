package com.spring.userservice.service;

import com.spring.userservice.dto.OrderDto;
import com.spring.userservice.entity.OrderEntity;

public interface OrderService {

    OrderDto createOrder(OrderDto orderDto);

    OrderDto getOrderByOrderId(String orderId);

    Iterable<OrderEntity> getOrdersByUserId(String userId);
}
