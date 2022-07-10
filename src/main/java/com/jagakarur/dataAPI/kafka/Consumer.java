package com.jagakarur.dataAPI.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
@Component
public class Consumer {
    @KafkaListener(topics = "first_topic")
    public void processMessage(String content){
        System.out.println("Message received: " + content);
    }
}
