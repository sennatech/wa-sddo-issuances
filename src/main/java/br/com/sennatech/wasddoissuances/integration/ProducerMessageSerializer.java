package br.com.sennatech.wasddoissuances.integration;

import br.com.sennatech.wasddoissuances.domain.dto.QuotationKafkaMessage;
import org.springframework.kafka.support.serializer.JsonSerializer;

public class ProducerMessageSerializer extends JsonSerializer<QuotationKafkaMessage> {
}