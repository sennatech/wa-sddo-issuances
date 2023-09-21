package br.com.sennatech.wasddoquotation.integration;

import br.com.sennatech.wasddoquotation.domain.dto.QuotationKafkaMessage;
import org.springframework.kafka.support.serializer.JsonSerializer;

public class ProducerMessageSerializer extends JsonSerializer<QuotationKafkaMessage> {
}
