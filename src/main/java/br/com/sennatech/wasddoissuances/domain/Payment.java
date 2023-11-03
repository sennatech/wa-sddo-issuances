package br.com.sennatech.wasddoissuances.domain;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Embeddable
@Data
@RequiredArgsConstructor
public class Payment {
    private Long paymentId;
    private double amount;
    private String cardToken;
    private String document;
}
