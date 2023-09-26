package br.com.sennatech.wasddoissuances.service;

import br.com.sennatech.wasddoissuances.controller.dto.request.IssuanceRequestDTO;
import br.com.sennatech.wasddoissuances.domain.HolderObj;
import br.com.sennatech.wasddoissuances.service.integration.GetCustumerIntegration;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetCustumerByDocNumber {
    @Autowired
    private  GetCustumerIntegration getCustumerIntegration;

    public HolderObj execute(IssuanceRequestDTO issuanceRequestDTO){
        Gson gson = new Gson();

        final String holder = getCustumerIntegration.getAddressByDocumentNumber(issuanceRequestDTO.documentNumber());
        HolderObj holderObj= gson.fromJson(holder,HolderObj.class);
        return holderObj;
    }

}
