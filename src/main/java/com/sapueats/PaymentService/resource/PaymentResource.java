package com.sapueats.PaymentService.resource;

import com.sapueats.PaymentService.model.Order;
import com.sapueats.PaymentService.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController@RequestMapping("/payment")
public class PaymentResource {

    @Autowired
    PaymentRepository paymentRepository;



    @Autowired
    KafkaTemplate<String, Order> kafkaTemplate;

    private String topicName = "new_order";
    private String msg;

    @GetMapping("/orders")
    public String readOrder() {
//          step1: Validation

//          step2: persist Order in DB


//          step3: produce kafka topic
        System.out.println("Reading Kafka Message");
            listen(msg);

        return "Submit Order is successful";
    }



    @KafkaListener(topics = "new_order", groupId = "foo")
    public void listen(String message) {
        System.out.println("Received Messasge in group foo: " + message);
    }

}
