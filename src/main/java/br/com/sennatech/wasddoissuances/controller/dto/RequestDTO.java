package br.com.sennatech.wasddoissuances.controller.dto;

import lombok.Data;

import java.util.List;

@Data
public class RequestDTO {
    List<CoverageResource> coverages;
    String documentNumber;
    String paymentId;
    InsuredAddressDTO insuredAddress;
}

