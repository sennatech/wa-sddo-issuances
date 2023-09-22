package br.com.sennatech.wasddoissuances.integration;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class KafkaConsumer {

    private final KafkaTemplate<Object, ResponseKafkaDTO> kafkaTemplate;

    @Value("${topic.name}")
    private String topicName;

    public void send(ResponseKafkaDTO message) {
        this.kafkaTemplate.send(topicName, message);
        System.out.println("Published the value [{}], with quotation code: to the kafka queue: [{}]" +
                message.data +
                topicName
        );
    }
}