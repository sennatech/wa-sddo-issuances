package br.com.sennatech.wasddoissuances.service;

import br.com.sennatech.wasddoissuances.controller.dto.response.CustomCoverage;
import br.com.sennatech.wasddoissuances.controller.dto.response.PolicyDetailsDTO;
import br.com.sennatech.wasddoissuances.domain.Validity;
import br.com.sennatech.wasddoissuances.service.dto.*;
import br.com.sennatech.wasddoissuances.service.integration.GetNametIntegration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ConverterCoverageDBtoCustomCoverage {

    private final GetNametIntegration getNametIntegration;

    @Autowired
    public ConverterCoverageDBtoCustomCoverage(GetNametIntegration getNametIntegration) {
        this.getNametIntegration = getNametIntegration;
    }

    public PolicyDetailsDTO convertToDetailsDTO(PolicyDB policyDB) {
        List<CustomCoverage> coverages = policyDB.getCoverages().stream()
                .map(this::convertCoverageDBToCustomCoverage)
                .collect(Collectors.toList());
        InsuredAddressDB insuredAddress = getInsuredAddress(policyDB.getInsuredAddresses());

        PaymentDB paymentDB = new PaymentDB();
        BigDecimal amount = paymentDB.getAmount();

        return PolicyDetailsDTO.builder()
                .number(policyDB.getNumber())
                .documentNumber(policyDB.getHolderDocument())
                .amount(policyDB.getAmount())
                .paymentId(policyDB.getPaymentId())
                .coverages(coverages)
                .insuredAddresses(insuredAddress)
                .validity(new Validity(policyDB.getValidityStart(), policyDB.getValidityEnd()))
                .build();
    }


    private CustomCoverage convertCoverageDBToCustomCoverage(CoverageDB coverageDB) {
        InitialCoverage initialCoverage = getNametIntegration.getName(Long.valueOf(coverageDB.getId()));

        CustomCoverage customCoverage = new CustomCoverage();
        return customCoverage
                .builder()
                .name(initialCoverage.getName())
                .code(Long.valueOf(coverageDB.getId()))
                .amount(coverageDB.getHiredAmount())
                .build();
    }


    private static InsuredAddressDB getInsuredAddress(InsuredAddressDB insuredAddress) {
        if (insuredAddress == null) {
            return null;
        }
        return InsuredAddressDB
                .builder()
                .id(insuredAddress.getId())
                .street(insuredAddress.getStreet())
                .number(insuredAddress.getNumber())
                .neighbourhood(insuredAddress.getNeighbourhood())
                .city(insuredAddress.getCity())
                .state(insuredAddress.getState())
                .country(insuredAddress.getCountry())
                .zipcode(insuredAddress.getZipcode())
                .build();
    }
}
