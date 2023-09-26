package br.com.sennatech.wasddoissuances.service;

import br.com.sennatech.wasddoissuances.controller.dto.request.IssuanceRequestDTO;
import br.com.sennatech.wasddoissuances.controller.dto.response.IssuanceResponseDTO;
import br.com.sennatech.wasddoissuances.service.integration.GetCustumerIntegration;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class IssuanceBusinessRulesService {

    private final GetCustumerIntegration getCustumerIntegration;

    public IssuanceResponseDTO execute(IssuanceRequestDTO request){

        final var teste = getCustumerIntegration.getAddressByDocumentNumber(request.documentNumber());
        System.out.println(teste);
        return null;
    }
}
