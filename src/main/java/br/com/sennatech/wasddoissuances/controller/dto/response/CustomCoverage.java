package br.com.sennatech.wasddoissuances.controller.dto.response;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@Builder
@Embeddable
@AllArgsConstructor
@NoArgsConstructor

public class CustomCoverage {
    private Long code;
    private String name;
    private BigDecimal amount;
}
