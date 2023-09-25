package br.com.sennatech.wasddoissuances.domain;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
@Data
@RequiredArgsConstructor
public class Policy {
    Integer number ;
    Validity validity;
    BigDecimal totalValue;
    List<Coverage> coverages;
    InsuredAddress insuredAdress;

}
