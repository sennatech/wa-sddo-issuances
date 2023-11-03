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
public class Coverage {
    private Integer code;
    private String type;
    private String name;
    private String description;
    private BigDecimal amount;
    private BigDecimal sumInsured;
    private boolean required;
}
