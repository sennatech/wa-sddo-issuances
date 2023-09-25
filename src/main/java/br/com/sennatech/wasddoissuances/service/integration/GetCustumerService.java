package br.com.sennatech.wasddoissuances.service.integration;
import br.com.sennatech.wasddoissuances.domain.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "documentNumber", url = "https://fa-dev-sddo-customers.azurewebsites.net/api/customers")
public interface GetCustumerService {


    @GetMapping("/{documentNumber}?clientId=apim-sennatech-dev")
    Address getAddressByDocumentNumber(@PathVariable String documentNumber);


}

//https://fa-dev-sddo-customers.azurewebsites.net/api/customers/{documentNumber}?clientId=apim-sennatech-dev

