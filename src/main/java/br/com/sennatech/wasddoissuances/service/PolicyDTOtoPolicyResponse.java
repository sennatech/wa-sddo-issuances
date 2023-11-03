package br.com.sennatech.wasddoissuances.service;

import br.com.sennatech.wasddoissuances.controller.dto.response.PolicyDTO;
import br.com.sennatech.wasddoissuances.domain.Validity;
import br.com.sennatech.wasddoissuances.service.dto.PolicyDB;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyDTOtoPolicyResponse {

    @Autowired
    public PolicyDTOtoPolicyResponse(ModelMapper mapper) {
    }
    public PolicyDTO convertToDTO(PolicyDB policyDB) {
        return PolicyDTO.builder()
                .number(policyDB.getNumber())
                .documentNumber(policyDB.getHolderDocument())
                .amount(policyDB.getAmount())
                .validity(new Validity(policyDB.getValidityStart(), policyDB.getValidityEnd()))
                .build();
    }


}
