package br.com.sennatech.wasddoissuances.integration.kafka;

import br.com.sennatech.wasddoissuances.integration.kafka.dto.ResponseKafkaDTO;
import org.springframework.kafka.support.serializer.JsonSerializer;

public class ProducerMessageSerializer extends JsonSerializer<ResponseKafkaDTO> {
}