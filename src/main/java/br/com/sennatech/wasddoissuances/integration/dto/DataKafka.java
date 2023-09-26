package br.com.sennatech.wasddoissuances.integration.dto;

import br.com.sennatech.wasddoissuances.domain.Holder;
import br.com.sennatech.wasddoissuances.domain.Policy;
import lombok.*;

@Data
@RequiredArgsConstructor
public class DataKafka {
    Policy policy;
    Holder holder;
}
