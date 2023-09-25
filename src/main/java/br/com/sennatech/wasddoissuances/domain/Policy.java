package br.com.sennatech.wasddoissuances.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
@Data
public class Policy {
    Integer number ;
    Validity validity;
    BigDecimal totalValue;
    List<Coverage> coverages;

}
