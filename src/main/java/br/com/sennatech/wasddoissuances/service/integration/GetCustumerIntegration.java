package br.com.sennatech.wasddoissuances.service.integration;

import br.com.sennatech.wasddoissuances.domain.Holder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "documentNumber", url = "${feignclient.url}")
public interface GetCustumerIntegration {

    @GetMapping("/{documentNumber}?clientId=apim-sennatech-dev")
    Holder teste(@PathVariable String documentNumber);

    @GetMapping("/{documentNumber}?clientId=apim-sennatech-dev")
    String getAddressByDocumentNumber(@PathVariable String documentNumber);

}
