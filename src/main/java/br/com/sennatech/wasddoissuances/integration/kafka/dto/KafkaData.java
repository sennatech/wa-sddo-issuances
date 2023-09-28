package br.com.sennatech.wasddoissuances.integration.kafka.dto;

import br.com.sennatech.wasddoissuances.domain.Issuance;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KafkaData {
    private Issuance issuance;
}
