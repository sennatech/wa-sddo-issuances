package br.com.sennatech.wasddoissuances.service;

import br.com.sennatech.wasddoissuances.controller.dto.InsuredAddressDTO;
import br.com.sennatech.wasddoissuances.controller.dto.request.IssuanceRequestDTO;
import br.com.sennatech.wasddoissuances.domain.Coverage;
import br.com.sennatech.wasddoissuances.repository.PolicyRepository;
import br.com.sennatech.wasddoissuances.service.dto.CoverageDB;
import br.com.sennatech.wasddoissuances.service.dto.InsuredAddressDB;
import br.com.sennatech.wasddoissuances.service.dto.PolicyDB;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SavePolicyService {

    private final PolicyRepository repository;

    @Transactional
    public PolicyDB execute(IssuanceRequestDTO request) {
        final var policy = getPolicy(request);
        final var coverages = getCoverages(request, policy);
        final var insuredAddress = getInsuredAddress(request.getInsuredAddress(), policy);
        policy.setCoverages(coverages);
        policy.setInsuredAddress(insuredAddress);

        return repository.save(policy);
    }

    private static PolicyDB getPolicy(IssuanceRequestDTO request) {
        return PolicyDB
                .builder()
                .validityStart(LocalDate.now().toString())
                .validityEnd(LocalDate.now().plusYears(1).toString())
                .totalValue(request.getPolicyValue())
                .holderDocument(request.getDocumentNumber())
                .paymentId(request.getPaymentId())
                .build();
    }

    private List<CoverageDB> getCoverages(IssuanceRequestDTO request, PolicyDB policy) {
        return request
                .getCoverages()
                .stream()
                .map(coverage -> getCoverage(coverage, policy))
                .collect(Collectors.toList());
    }

    private CoverageDB getCoverage(Coverage coverage, PolicyDB policy) {
        return CoverageDB
                .builder()
                .coverageId(coverage.getCode())
                .hiredValue(coverage.getValue())
                .policy(policy)
                .build();
    }

    private static InsuredAddressDB getInsuredAddress(InsuredAddressDTO insuredAddress, PolicyDB policy) {
        return InsuredAddressDB
                .builder()
                .street(insuredAddress.getStreet())
                .number(insuredAddress.getNumber())
                .district(insuredAddress.getDistrict())
                .city(insuredAddress.getCity())
                .state(insuredAddress.getState())
                .country(insuredAddress.getCountry())
                .zipcode(insuredAddress.getZipcode())
                .policy(policy)
                .build();
    }
}
