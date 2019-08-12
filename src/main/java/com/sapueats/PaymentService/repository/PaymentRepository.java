package com.sapueats.PaymentService.repository;

import com.sapueats.PaymentService.model.Order;
import com.sapueats.PaymentService.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableJpaRepositories
public interface PaymentRepository extends JpaRepository<Payment, String> {
}
