package br.com.sennatech.wasddoissuances.controller.dto;

import br.com.sennatech.wasddoissuances.domain.Coverage;
import lombok.Data;

import java.util.List;

@Data
public class RequestDTO {
    List<Coverage> coverages;
    String documentNumber;
    String paymentId;
    InsuredAddressDTO insuredAddress;
}

