package br.com.sennatech.wasddoissuances.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Policy {
    Integer number ;
    Validity validity;
    BigDecimal totalValue;
    List<Coverage> coverages;
}
