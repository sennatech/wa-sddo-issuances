package br.com.sennatech.wasddoissuances.integration.kafka.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseKafkaDTO {
    String timestamp = LocalDateTime.now().toString();
    String operation = "EMISSAO" ;
    String domain = "SEGURO";
    String origin = "Asseguraê";
    KafkaData data;
}
