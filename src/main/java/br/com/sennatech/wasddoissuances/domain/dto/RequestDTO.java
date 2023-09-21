package br.com.sennatech.wasddoissuances.domain.dto;

import java.util.List;

public record RequestDTO(List<CoverageResource> coverages, String documentNumber, String paymentId, InsuredAddressDTO insuredAddress) {}

