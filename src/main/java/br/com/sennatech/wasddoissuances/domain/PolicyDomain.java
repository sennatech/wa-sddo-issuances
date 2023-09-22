package br.com.sennatech.wasddoissuances.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
@Data
public class PolicyDomain {
    Integer number ;
    ValidityObj validity;
    BigDecimal totalValue;
    List<Coverage> coverages;

}
