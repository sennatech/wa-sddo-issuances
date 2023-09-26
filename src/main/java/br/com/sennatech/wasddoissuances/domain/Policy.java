package br.com.sennatech.wasddoissuances.domain;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Policy {
    Integer number ;
    Validity validity;
    BigDecimal totalValue;
    List<Coverage> coverages;
}
