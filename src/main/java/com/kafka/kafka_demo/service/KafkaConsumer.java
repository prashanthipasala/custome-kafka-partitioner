package com.kafka.kafka_demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "my-topic",groupId = "my-group")
    public void receive(String message){
        System.out.println("Received message: "+message);
    }
}
