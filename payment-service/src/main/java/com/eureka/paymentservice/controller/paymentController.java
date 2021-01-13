package com.eureka.paymentservice.controller;

import com.eureka.paymentservice.entity.paymentEntity;
import com.eureka.paymentservice.service.paymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class paymentController {

    @Autowired
    private paymentService service;

    @PostMapping("/doPayment")
    public paymentEntity doPayment(@RequestBody paymentEntity payment) {
       return service.doPayment(payment);
    }

    @GetMapping("/{orderId}")
    public paymentEntity findDetails(@PathVariable int orderId){
        return service.findDetails(orderId);
    }

}
