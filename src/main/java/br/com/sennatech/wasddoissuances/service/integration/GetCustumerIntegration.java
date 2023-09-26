package br.com.sennatech.wasddoissuances.service.integration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "documentNumber", url = "https://fa-dev-sddo-customers.azurewebsites.net/api/customers")
public interface GetCustumerIntegration {

    @GetMapping("/{documentNumber}?clientId=apim-sennatech-dev")
    String getAddressByDocumentNumber(@PathVariable String documentNumber);

}
