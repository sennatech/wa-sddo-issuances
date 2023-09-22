package br.com.sennatech.wasddoissuances.domain.dto;

import br.com.sennatech.wasddoissuances.domain.HolderObj;
import br.com.sennatech.wasddoissuances.domain.InsuredAddress;
import br.com.sennatech.wasddoissuances.domain.PolicyDomain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO{
    PolicyDomain policy;
    HolderObj holder;
    InsuredAddress insuredAdress;
}
