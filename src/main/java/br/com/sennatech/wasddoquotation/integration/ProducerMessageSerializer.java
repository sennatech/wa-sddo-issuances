package br.com.sennatech.wasddoquotation.integration;

import org.springframework.kafka.support.serializer.JsonSerializer;

public class ProducerMessageSerializer extends JsonSerializer<SimpleMessage> {
}
