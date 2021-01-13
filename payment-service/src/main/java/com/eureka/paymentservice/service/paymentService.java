package com.eureka.paymentservice.service;

import com.eureka.paymentservice.entity.paymentEntity;
import com.eureka.paymentservice.repository.paymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class paymentService {

    @Autowired
    private paymentRepository repo;

    public paymentEntity doPayment(paymentEntity payment){
        payment.setPayStatus(paymentProcessing());
        payment.setTransId(UUID.randomUUID().toString());
        return repo.save(payment);
    }

    public paymentEntity findDetails(int orderId){
        return repo.findByOrderId(orderId);
    }

    public String paymentProcessing(){
        return new Random().nextBoolean()?"success":"false";
    }
}
