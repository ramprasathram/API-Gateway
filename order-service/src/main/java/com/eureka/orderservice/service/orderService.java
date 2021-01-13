package com.eureka.orderservice.service;

import com.eureka.orderservice.common.TransactionRequest;
import com.eureka.orderservice.common.TransactionResponse;
import com.eureka.orderservice.common.paymentEntity;
import com.eureka.orderservice.entity.orderEntity;
import com.eureka.orderservice.repository.orderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class orderService {
    @Autowired
    public orderRepository repository;

    @Autowired
    private RestTemplate restTemplate;

    public TransactionResponse saveOrder(TransactionRequest req){
        String res = "";
        orderEntity order = req.getOrder();
        paymentEntity payment = req.getPayment();
        payment.setOrderId(order.getId());
        payment.setAmount(order.getPrice());

       // paymentEntity paymentResponse = restTemplate.postForObject("http://localhost:9092/payment/doPayment", payment, paymentEntity.class);

        paymentEntity paymentResponse = restTemplate.postForObject("http://payment-service/payment/doPayment", payment, paymentEntity.class);


        res = paymentResponse.getPayStatus().equals("success")?"payment success":"payment failed";
        repository.save(order);
        return new TransactionResponse(order,paymentResponse.getTransId(),paymentResponse.getAmount(),res);
    }
}
