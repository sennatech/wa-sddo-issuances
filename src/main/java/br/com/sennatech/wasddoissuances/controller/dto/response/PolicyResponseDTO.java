package br.com.sennatech.wasddoissuances.controller.dto.response;

import br.com.sennatech.wasddoissuances.controller.dto.CoverageDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PolicyResponseDTO {
    Integer number;
    ValidityResponseDTO validity;
    BigDecimal totalValue;
    List<CoverageDTO> coverages;
}
