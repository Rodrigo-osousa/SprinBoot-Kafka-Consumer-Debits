package com.bankend.kafkaDebits;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "debitId", groupId = "groupId")
    void listener(String data) {
        System.out.println("Listener receiced: " + data + "!");
    }
}
