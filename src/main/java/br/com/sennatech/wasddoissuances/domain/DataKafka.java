package br.com.sennatech.wasddoissuances.domain;

import lombok.*;

@Data
@RequiredArgsConstructor
public class DataKafka {
    Policy policy;
    HolderObj holder;
}
