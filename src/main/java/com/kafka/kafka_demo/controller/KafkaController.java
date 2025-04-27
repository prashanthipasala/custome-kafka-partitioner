package com.kafka.kafka_demo.controller;

import com.kafka.kafka_demo.service.KafkaProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class KafkaController {

    public  final KafkaProducer kafkaProducer;

    @GetMapping("/send/{message}")
    public ResponseEntity<String > publish(@PathVariable String message){
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to topic");
    }
}
