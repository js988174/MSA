package com.spring.userservice.controller;

import com.spring.userservice.dto.OrderDto;
import com.spring.userservice.dto.UserDto;
import com.spring.userservice.entity.OrderEntity;
import com.spring.userservice.service.OrderService;
import com.spring.userservice.vo.RequestOrder;
import com.spring.userservice.vo.RequestUser;
import com.spring.userservice.vo.ResponseOder;
import com.spring.userservice.vo.ResponseUser;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order-service")
@RequiredArgsConstructor
public class OrderController {

    private final Environment environment;
    private final OrderService orderService;

    @GetMapping("/health_check")
    public String status() {
        return String.format("It's Working in User Service", environment.getProperty("local.server.port"));
    }

    @PostMapping("/{userId}/orders")
    public ResponseEntity<ResponseOder> createOrder(@PathVariable("userId") String userId,
            @RequestBody RequestOrder orderDetails) {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        OrderDto orderDto = mapper.map(orderDetails, OrderDto.class);
        orderDto.setUserId(userId);

        OrderDto createOrder = orderService.createOrder(orderDto);

        ResponseOder responseOder = mapper.map(createOrder, ResponseOder.class);

        return ResponseEntity.status(HttpStatus.CREATED).body(responseOder);
    }

    @GetMapping("/{userId}/orders")
    public ResponseEntity<List<ResponseOder>> getUsers(@PathVariable("userId") String userId) {
        Iterable<OrderEntity> orderList = orderService.getOrdersByUserId(userId);

        List<ResponseOder> result = new ArrayList<>();
        orderList.forEach(v -> {
            result.add(new ModelMapper().map(v, ResponseOder.class));
        });


        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
