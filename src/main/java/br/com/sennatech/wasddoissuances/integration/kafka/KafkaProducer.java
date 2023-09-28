package br.com.sennatech.wasddoissuances.integration.kafka;

import br.com.sennatech.wasddoissuances.domain.Issuance;
import br.com.sennatech.wasddoissuances.integration.kafka.dto.KafkaData;
import br.com.sennatech.wasddoissuances.integration.kafka.dto.ResponseKafkaDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaProducer {

    private final KafkaTemplate<Object, ResponseKafkaDTO> kafkaTemplate;

    @Value("${topic.name}")
    private String topicName;

    public void send(Issuance issuance) {
        final var message = getKafkaMessage(issuance);
        this.kafkaTemplate.send(topicName, message);
        log.info("Published the value [{}], with quotation code: to the kafka queue: [{}]",
                message.getData(),
                topicName
        );
    }

    private ResponseKafkaDTO getKafkaMessage(Issuance issuance) {
        ResponseKafkaDTO kafkaResponse = new ResponseKafkaDTO();
        KafkaData data = new KafkaData();
        data.setIssuance(issuance);
        kafkaResponse.setData(data);
        return kafkaResponse;
    }
}