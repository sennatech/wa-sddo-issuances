package br.com.sennatech.wasddoissuances.service;

import br.com.sennatech.wasddoissuances.controller.dto.request.IssuanceRequestDTO;
import br.com.sennatech.wasddoissuances.controller.dto.response.IssuanceResponseDTO;
import br.com.sennatech.wasddoissuances.domain.FinalIssuance;
import br.com.sennatech.wasddoissuances.service.converters.ConvertISAddressDTOToISAddress;
import br.com.sennatech.wasddoissuances.service.integration.GetCustumerIntegration;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class IssuanceBusinessRulesService {

    private final GetCustumerByDocNumber getCustumerIntegration;
    private final PolicyInitializer policyInitializer;
    private final ConvertISAddressDTOToISAddress convertISAddressDTOToISAddress;

    public FinalIssuance execute(IssuanceRequestDTO request){
        final var getPolicy = policyInitializer.getPolicy(request);
        final var getHolder = getCustumerIntegration.execute(request);
        FinalIssuance finalIssuance = new FinalIssuance(getPolicy,getHolder,convertISAddressDTOToISAddress.convert(request.insuredAddress()));

        System.out.println(getHolder);
        return finalIssuance ;
    }
}
