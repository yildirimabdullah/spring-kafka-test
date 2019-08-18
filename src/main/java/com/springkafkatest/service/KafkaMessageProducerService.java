package com.springkafkatest.service;

import com.springkafkatest.model.event.UpdatedBrandEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageProducerService {

    private static final String TOPIC_NAME = "UpdatedBrandEvent";

    private final KafkaTemplate<String, UpdatedBrandEvent> kafkaTemplate;

    @Autowired
    public KafkaMessageProducerService(KafkaTemplate<String, UpdatedBrandEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(UpdatedBrandEvent updatedBrandEvent) {
        kafkaTemplate.send(TOPIC_NAME, updatedBrandEvent);
    }
}