package br.com.sennatech.wasddoissuances.service;

import br.com.sennatech.wasddoissuances.controller.dto.InsuredAddressDTO;
import br.com.sennatech.wasddoissuances.controller.dto.request.IssuanceRequestDTO;
import br.com.sennatech.wasddoissuances.domain.Coverage;
import br.com.sennatech.wasddoissuances.repository.PolicyRepository;
import br.com.sennatech.wasddoissuances.service.dto.CoverageDB;
import br.com.sennatech.wasddoissuances.service.dto.InsuredAddressDB;
import br.com.sennatech.wasddoissuances.service.dto.PaymentDB;
import br.com.sennatech.wasddoissuances.service.dto.PolicyDB;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SavePolicyService {
    private final GetPayment getPaymentService;
    private final PolicyRepository repository;

    @Transactional
    public PolicyDB execute(IssuanceRequestDTO request) {
        final var payment = getPaymentService.execute(Long.valueOf(request.getPaymentId()));
        final var policy = getPolicy(request, payment );
        final var coverages = getCoverages(request, policy);
        final var insuredAddress = getInsuredAddress(request.getInsuredAddress(), policy);
        policy.setCoverages(coverages);
        policy.setInsuredAddresses(insuredAddress);


        return repository.save(policy);
    }

    private static PolicyDB getPolicy(IssuanceRequestDTO request, PaymentDB payment) {
        return PolicyDB
                .builder()
                .validityStart(LocalDate.now().toString())
                .validityEnd(LocalDate.now().plusYears(1).toString())
                .amount((payment.getAmount()))
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
                .hiredAmount(coverage.getAmount())
                .policy(policy)
                .build();
    }

    private static InsuredAddressDB getInsuredAddress(InsuredAddressDTO insuredAddress, PolicyDB policy) {
        return InsuredAddressDB
                .builder()
                .street(insuredAddress.getStreet())
                .number(insuredAddress.getNumber())
                .neighbourhood(insuredAddress.getNeighbourhood())
                .city(insuredAddress.getCity())
                .state(insuredAddress.getState())
                .country(insuredAddress.getCountry())
                .zipcode(insuredAddress.getZipcode())
                .policy(policy)
                .build();
    }
}
