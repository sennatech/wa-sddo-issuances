package br.com.sennatech.wasddoissuances.controller.dto.response;

import br.com.sennatech.wasddoissuances.domain.Validity;

import java.math.BigDecimal;

public class CoverageDTOresponse {
    private Long number;
    private String documentNumber;
    private BigDecimal value;
    private Validity validity;
}
