package br.com.sennatech.wasddoissuances.integration;

import org.springframework.kafka.support.serializer.JsonSerializer;

public class ProducerMessageSerializer extends JsonSerializer<SimpleMessage> {
}