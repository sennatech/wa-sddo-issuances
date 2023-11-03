package br.com.sennatech.wasddoissuances.controller.dto;

import br.com.sennatech.wasddoissuances.controller.dto.response.CustomCoverage;
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
    public class PolicyDTOResponse {

        private Long number;
        private String documentNumber;
        private String paymentId;
        private BigDecimal amount;
        private String validityStart ;
        private String validityEnd;
        private CustomCoverage coverages;
        private List<InsuredAddressDTO> insuredAddressDTOS;
    }


