package br.com.sennatech.wasddoissuances.controller.dto.response;

import br.com.sennatech.wasddoissuances.controller.dto.CoverageDTO;

import java.math.BigDecimal;
import java.util.List;

public record PolicyResponseDTO(
    Integer number,
    ValidityResponseDTO validity,
    BigDecimal totalValue,
    List<CoverageDTO> coverages
){
}
