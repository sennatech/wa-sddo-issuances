package br.com.sennatech.wasddoissuances.service;

import br.com.sennatech.wasddoissuances.controller.dto.request.IssuanceRequestDTO;
import br.com.sennatech.wasddoissuances.domain.Holder;
import br.com.sennatech.wasddoissuances.service.integration.GetCustumerIntegration;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetCustumerByDocNumber {
    @Autowired
    private  GetCustumerIntegration getCustumerIntegration;

    public Holder execute(IssuanceRequestDTO issuanceRequestDTO){
//        final var teste = getCustumerIntegration.teste(issuanceRequestDTO.documentNumber());
//        System.out.println("=========");
//        System.out.println("=========");
//        System.out.println("=========");
//        System.out.println(teste);
//        System.out.println();
//        System.out.println();
//        System.out.println();

        Gson gson = new Gson();

        final String holder = getCustumerIntegration.getAddressByDocumentNumber(issuanceRequestDTO.getDocumentNumber());
        System.out.println(holder);
        Holder holderObj= gson.fromJson(holder, Holder.class);
        return holderObj;
    }

}
