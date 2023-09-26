package br.com.sennatech.wasddoissuances.controller.dto.request;

import br.com.sennatech.wasddoissuances.controller.dto.InsuredAddressDTO;
import br.com.sennatech.wasddoissuances.domain.Coverage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IssuanceRequestDTO {
        private List<Coverage> coverages;
        private BigDecimal policyValue;
        private String documentNumber;
        private String paymentId;
        private InsuredAddressDTO insuredAddress;
}

