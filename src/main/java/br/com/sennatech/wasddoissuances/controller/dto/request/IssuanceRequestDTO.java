package br.com.sennatech.wasddoissuances.controller.dto.request;

import br.com.sennatech.wasddoissuances.controller.dto.InsuredAddressDTO;
import br.com.sennatech.wasddoissuances.domain.Coverage;

import java.util.List;

public record IssuanceRequestDTO(
        List<Coverage> coverages,
        String documentNumber,
        String paymentId,
        InsuredAddressDTO insuredAddress
) {
}

