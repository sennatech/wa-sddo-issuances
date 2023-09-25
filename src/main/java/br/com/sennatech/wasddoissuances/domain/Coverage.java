package br.com.sennatech.wasddoissuances.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Coverage {
    Integer code;
    String type;
    String name;
    String description;
    BigDecimal value;
    BigDecimal sumInsured;
    boolean required;
}
