package br.com.sennatech.wasddoissuances.integration.kafka.dto;

import br.com.sennatech.wasddoissuances.domain.Issuance;
import br.com.sennatech.wasddoissuances.domain.Policy;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KafkaData {
    private Issuance issuance;
}
