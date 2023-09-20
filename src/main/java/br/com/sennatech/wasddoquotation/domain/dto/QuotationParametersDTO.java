package br.com.sennatech.wasddoquotation.domain.dto;

import br.com.sennatech.wasddoquotation.domain.InsuredAddress;
import lombok.Data;

import java.util.List;

@Data
public class QuotationParametersDTO{
    List<Coverage> coverages;
    InsuredAddress insuredAddress;
}

