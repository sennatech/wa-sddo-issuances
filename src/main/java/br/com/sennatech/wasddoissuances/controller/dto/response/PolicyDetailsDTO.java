package br.com.sennatech.wasddoissuances.controller.dto.response;

import br.com.sennatech.wasddoissuances.domain.Validity;
import br.com.sennatech.wasddoissuances.service.dto.InsuredAddressDB;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PolicyDetailsDTO {
    private Long number ;
    private String documentNumber;
    private BigDecimal value;
    private String paymentId;
    private List<CustomCoverage> coverages;
    private Validity validity;
    private InsuredAddressDB insuredAddresses;
}