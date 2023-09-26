package br.com.sennatech.wasddoissuances.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoverageDTO {
    Integer code;
    String type;
    String name;
    String description;
    BigDecimal value;
    BigDecimal sumInsured;
    boolean required;
}
