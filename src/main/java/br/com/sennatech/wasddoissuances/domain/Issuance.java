package br.com.sennatech.wasddoissuances.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Issuance {
    private Policy policy;
    private Holder holder;
    private Long paymentId;
    private BigDecimal amount;
    private InsuredAddress insuredAddress;
}
