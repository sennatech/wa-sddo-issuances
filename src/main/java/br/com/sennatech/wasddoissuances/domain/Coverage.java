package br.com.sennatech.wasddoissuances.domain;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class Coverage {
    Integer code;
    String type;
    String name;
    String description;
    BigDecimal value;
    BigDecimal sumInsured;
    boolean required;
}
