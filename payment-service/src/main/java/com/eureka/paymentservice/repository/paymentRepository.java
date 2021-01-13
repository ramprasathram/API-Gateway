package com.eureka.paymentservice.repository;

import com.eureka.paymentservice.entity.paymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface paymentRepository extends JpaRepository<paymentEntity, Integer> {
    paymentEntity findByOrderId(int orderId);
}
