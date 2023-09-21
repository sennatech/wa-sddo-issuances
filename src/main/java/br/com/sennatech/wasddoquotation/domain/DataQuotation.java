package br.com.sennatech.wasddoquotation.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class DataQuotation {
    private String quotationNumber;
    private BigDecimal value;

}
