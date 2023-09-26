package br.com.sennatech.wasddoissuances.service;

import br.com.sennatech.wasddoissuances.controller.dto.request.IssuanceRequestDTO;
import br.com.sennatech.wasddoissuances.domain.Coverage;
import br.com.sennatech.wasddoissuances.domain.Policy;
import br.com.sennatech.wasddoissuances.domain.Validity;
import br.com.sennatech.wasddoissuances.service.converters.ConvertInsuredAddressDTOToInsuredAddress;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetPolicy {

    private  final GetValidityDate getValidityDate;
    private final ConvertInsuredAddressDTOToInsuredAddress convertISAddress;
    private final ModelMapper mapper;

    public Policy execute(IssuanceRequestDTO request){
        return Policy
                .builder()
                .number(1)
                .validity(getValidity())
                .totalValue(request.getPolicyValue())
                .coverages(getCoverages(request))
                .build();
    }

    private Validity getValidity() {
        return Validity
                .builder()
                .start(getValidityDate.getDate())
                .end(getValidityDate.calculateDate())
                .build();
    }

    private List<Coverage> getCoverages(IssuanceRequestDTO request) {
        final var listType = new TypeToken<List<Coverage>>() {}.getType();
        return mapper.map(request.getCoverages(), listType);
    }
}
