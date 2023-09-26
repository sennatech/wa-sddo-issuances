package br.com.sennatech.wasddoissuances.service;

import br.com.sennatech.wasddoissuances.controller.dto.request.IssuanceRequestDTO;
import br.com.sennatech.wasddoissuances.service.integration.GetCustumerIntegration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class GetCustumerByDocNumber {
    @Autowired
    private  GetCustumerIntegration getCustumerIntegration;
    public String execute(IssuanceRequestDTO issuanceRequestDTO){
        final var holder = getCustumerIntegration.getAddressByDocumentNumber(issuanceRequestDTO.documentNumber());
        return holder;
    }

}
