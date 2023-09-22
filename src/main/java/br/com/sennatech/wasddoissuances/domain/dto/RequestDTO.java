package br.com.sennatech.wasddoissuances.domain.dto;

import br.com.sennatech.wasddoissuances.domain.InsuredAddress;
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

