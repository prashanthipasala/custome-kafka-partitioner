package com.kafka.kafka_demo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {

    private final KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String message){
        kafkaTemplate.send("my-topic1",message);
        System.out.println("sent message: "+message);
    }


//    public void sendMessage(String message){
//        int i=0;
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        while(i++ != n){
//        kafkaTemplate.send("my-topic",message);
//        log.info("sent message: "+message);
//        }
//    }

}
