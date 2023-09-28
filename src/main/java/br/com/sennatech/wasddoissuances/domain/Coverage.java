package br.com.sennatech.wasddoissuances.domain;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class Coverage {
    private Integer code;
    private String type;
    private String name;
    private String description;
    private BigDecimal value;
    private BigDecimal sumInsured;
    private boolean required;
}
