package br.com.sennatech.wasddoissuances.service;

import br.com.sennatech.wasddoissuances.controller.dto.request.IssuanceRequestDTO;
import br.com.sennatech.wasddoissuances.domain.Issuance;
import br.com.sennatech.wasddoissuances.service.converters.ConvertInsuredAddressDTOToInsuredAddress;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class IssuanceBusinessRulesService {

    private final GetCustumerByDocNumber getCustumerIntegration;
    private final GetPolicy getPolicy;
    private final ConvertInsuredAddressDTOToInsuredAddress converterConvertInsuredAddressDTOToInsuredAddress;

    public Issuance execute(IssuanceRequestDTO request){
        final var issuance = Issuance
                .builder()
                .holder(getCustumerIntegration.execute(request))
                .policy(getPolicy.execute(request))
                .insuredAddress(converterConvertInsuredAddressDTOToInsuredAddress.convert(request.getInsuredAddress()))
                .build();

        System.out.println(issuance);

        return issuance;
    }
}
