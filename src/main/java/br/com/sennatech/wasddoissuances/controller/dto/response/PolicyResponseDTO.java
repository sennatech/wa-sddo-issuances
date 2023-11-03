package br.com.sennatech.wasddoissuances.controller.dto.response;

import br.com.sennatech.wasddoissuances.controller.dto.CoverageDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PolicyResponseDTO {
    Long number;
    ValidityResponseDTO validity;
    BigDecimal amount;
    List<CoverageDTO> coverages;
}
