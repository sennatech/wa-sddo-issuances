package br.com.sennatech.wasddoissuances.domain;

import java.math.BigDecimal;

public record Coverage(Integer code, String type, String name, String description, BigDecimal value, BigDecimal sumInsured, boolean required) {
}
