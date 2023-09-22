package br.com.sennatech.wasddoissuances.integration;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "${topic.name}")
    public void receive(SimpleMessage consumerMessage) {
        log.info("Received message from kafka queue: {}", consumerMessage.getBody());
    }
}