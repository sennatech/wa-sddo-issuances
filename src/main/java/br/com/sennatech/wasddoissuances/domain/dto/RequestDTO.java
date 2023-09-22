package br.com.sennatech.wasddoissuances.domain.dto;

import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
public class RequestDTO {
    List<CoverageResource> coverages;
    String documentNumber;
    String paymentId;
    InsuredAddressDTO insuredAddress;
}

