package br.com.sennatech.wasddoissuances.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FinalIssuance {
    private Policy policy;
    private HolderObj holderObj;
    private InsuredAddress insuredAddress;
}
