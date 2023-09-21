package br.com.sennatech.wasddoissuances.domain.dto;

import java.math.BigDecimal;

public record CoverageResource(Integer code, String type, String name, String description, BigDecimal value, BigDecimal sumInsured, boolean required) {
}
