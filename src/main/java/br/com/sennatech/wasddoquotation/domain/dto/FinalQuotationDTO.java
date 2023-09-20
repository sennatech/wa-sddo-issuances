package br.com.sennatech.wasddoquotation.domain.dto;

import java.math.BigDecimal;

public record FinalQuotationDTO(String quotationCode, BigDecimal value) {
}
