package br.com.sennatech.wasddoissuances.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CoverageDTO {
    Integer code;
    String type;
    String name;
    String description;
    BigDecimal amount;
    BigDecimal sumInsured;
    boolean required;
}
