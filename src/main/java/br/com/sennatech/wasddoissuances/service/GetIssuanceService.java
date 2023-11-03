package br.com.sennatech.wasddoissuances.service;

import br.com.sennatech.wasddoissuances.controller.dto.InsuredAddressDTO;
import br.com.sennatech.wasddoissuances.controller.dto.request.IssuanceRequestDTO;
import br.com.sennatech.wasddoissuances.domain.*;
import br.com.sennatech.wasddoissuances.service.dto.PolicyDB;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetIssuanceService {

    private final ModelMapper mapper;

    public Issuance execute(IssuanceRequestDTO request, PolicyDB policyDB, Holder holder) {
        return Issuance
                .builder()
                .policy(getPolicy(request, policyDB))
                .holder(holder)
                .insuredAddress(getInsuredAddress(request.getInsuredAddress()))
                .build();
    }

    private Policy getPolicy(IssuanceRequestDTO request, PolicyDB policyDB) {
        return Policy
                .builder()
                .number(policyDB.getNumber())
                .validity(getValidity(policyDB.getValidityStart(), policyDB.getValidityEnd()))
                .amount(request.getAmount())
                .coverages(getCoverages(request))
                .build();
    }

    private Validity getValidity(String start, String end) {
        return Validity
                .builder()
                .start(start)
                .end(end)
                .build();
    }

    private List<Coverage> getCoverages(IssuanceRequestDTO request) {
        final var listType = new TypeToken<List<Coverage>>() {}.getType();
        return mapper.map(request.getCoverages(), listType);
    }

    private InsuredAddress getInsuredAddress(InsuredAddressDTO insuredAddress) {
        return mapper.map(insuredAddress, InsuredAddress.class);
    }
}
