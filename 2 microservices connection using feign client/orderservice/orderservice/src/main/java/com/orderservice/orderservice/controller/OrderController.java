package com.orderservice.orderservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderservice.orderservice.model.Order;
import com.orderservice.orderservice.model.User;
import com.orderservice.orderservice.service.UserClient;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private UserClient userClient;
	
	
	 @GetMapping("/{orderId}")
	    public Map<String, Object> getOrderWithUser(@PathVariable Long orderId) {
	        // Sample Order
	        Order order = new Order(orderId, "Laptop", 101L);

	        // Call User Service
	        User user = userClient.getUserById(order.getUserId());

	        Map<String, Object> response = new HashMap<>();
	        response.put("order", order);
	        response.put("user", user);
	        return response;
	    }

}
