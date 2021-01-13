package com.eureka.orderservice.repository;

import com.eureka.orderservice.entity.orderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface orderRepository extends JpaRepository<orderEntity, Integer> {

}
