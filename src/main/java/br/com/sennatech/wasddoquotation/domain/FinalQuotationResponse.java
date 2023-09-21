package br.com.sennatech.wasddoquotation.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class FinalQuotationResponse {
    private String quotationNumber;
    private BigDecimal value;



}
