package com.eureka.paymentservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class paymentEntity {

    @Id
    @GeneratedValue
    private int paymentId;
    private String payStatus;
    private String TransId;
    private int orderId;
    private int amount;
}
