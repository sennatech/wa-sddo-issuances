package br.com.sennatech.wasddoissuances.controller.dto;

import br.com.sennatech.wasddoissuances.domain.HolderObj;
import br.com.sennatech.wasddoissuances.domain.InsuredAddress;
import br.com.sennatech.wasddoissuances.domain.Policy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO{
    Policy policy;
    HolderObj holder;
    InsuredAddress insuredAdress;
}
