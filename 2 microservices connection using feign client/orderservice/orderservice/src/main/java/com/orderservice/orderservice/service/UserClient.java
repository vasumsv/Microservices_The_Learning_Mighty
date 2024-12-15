package com.orderservice.orderservice.service;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.orderservice.orderservice.model.User;

@FeignClient(name = "user-service", url = "${user-service.url}")
@EnableFeignClients(basePackages = "com.orderservice.OrderService.service")
public interface UserClient {
	
    @GetMapping("/users/{userId}")
    User getUserById(@PathVariable Long userId);
}
