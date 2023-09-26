package br.com.sennatech.wasddoissuances.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Issuance {
    private Policy policy;
    private Holder holder;
    private String paymentId;
    private InsuredAddress insuredAddress;
}
