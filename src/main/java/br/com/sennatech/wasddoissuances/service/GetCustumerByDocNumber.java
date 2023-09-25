package br.com.sennatech.wasddoissuances.service;

import br.com.sennatech.wasddoissuances.controller.dto.RequestDTO;
import br.com.sennatech.wasddoissuances.domain.HolderObj;
import br.com.sennatech.wasddoissuances.service.integration.GetCustumerIntegration;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class GetCustumerByDocNumber {
    @Autowired
    private  GetCustumerIntegration getCustumerIntegration;
    public HolderObj execute(RequestDTO requestDTO){
        final var holder = getCustumerIntegration.getAddressByDocumentNumber(requestDTO.getDocumentNumber());
        return holder;
    }

}
