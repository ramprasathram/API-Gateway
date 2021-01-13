package com.eureka.orderservice.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class paymentEntity {

    private int paymentId;
    private String payStatus;
    private String TransId;
    private int orderId;
    private int amount;
}
