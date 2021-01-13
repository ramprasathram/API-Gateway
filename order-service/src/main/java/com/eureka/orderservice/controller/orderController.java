package com.eureka.orderservice.controller;

import com.eureka.orderservice.common.TransactionRequest;
import com.eureka.orderservice.common.TransactionResponse;
import com.eureka.orderservice.common.paymentEntity;
import com.eureka.orderservice.entity.orderEntity;
import com.eureka.orderservice.service.orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class orderController {

    @Autowired
    private orderService service;

    @PostMapping("/bookOrder")
    public TransactionResponse bookOrder(@RequestBody TransactionRequest req){

        return service.saveOrder(req);
    }
}
