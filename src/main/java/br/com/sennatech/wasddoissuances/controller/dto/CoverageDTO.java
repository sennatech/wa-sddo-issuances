package br.com.sennatech.wasddoissuances.controller.dto;

import java.math.BigDecimal;


public record CoverageDTO(
        Integer code,
        String type,
        String name,
        String description,
        BigDecimal value,
        BigDecimal sumInsured,
        boolean required
) {
}
