package br.com.sennatech.wasddoissuances.controller.dto.response;

import br.com.sennatech.wasddoissuances.controller.dto.CoverageDTO;
import br.com.sennatech.wasddoissuances.controller.dto.InsuredAddressDTO;

import java.math.BigDecimal;
import java.util.List;

public record IssuanceResponseDTO(
    PolicyResponseDTO policy,
    HolderResponseDTO holder,
    InsuredAddressDTO insuredAdress
){
}
