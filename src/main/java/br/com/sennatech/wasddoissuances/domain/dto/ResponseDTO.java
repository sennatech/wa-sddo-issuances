package br.com.sennatech.wasddoissuances.domain.dto;

import br.com.sennatech.wasddoissuances.domain.HolderObj;
import br.com.sennatech.wasddoissuances.domain.InsuredAdress;
import br.com.sennatech.wasddoissuances.domain.PolicyDomain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO{
    PolicyDomain policy;
    HolderObj holder;
    InsuredAdress insuredAdress;
}
