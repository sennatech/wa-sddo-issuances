package br.com.sennatech.wasddoissuances.service;

import br.com.sennatech.wasddoissuances.domain.Holder;
import br.com.sennatech.wasddoissuances.service.integration.GetCustumerIntegration;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetCustumerByDocumentNumberService {
    @Autowired
    private  GetCustumerIntegration getCustumerIntegration;

    public Holder execute(String documentNumber){
        Gson gson = new Gson();
        final String holder = getCustumerIntegration.getAddressByDocumentNumber(documentNumber);
        return gson.fromJson(holder, Holder.class);
    }

}
