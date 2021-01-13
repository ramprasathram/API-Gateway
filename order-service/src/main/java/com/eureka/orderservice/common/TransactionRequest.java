package com.eureka.orderservice.common;

import com.eureka.orderservice.entity.orderEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequest {

    private orderEntity order;
    private paymentEntity payment;
}
