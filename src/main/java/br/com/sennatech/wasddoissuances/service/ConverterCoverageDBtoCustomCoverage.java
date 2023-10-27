package br.com.sennatech.wasddoissuances.service;

import br.com.sennatech.wasddoissuances.controller.dto.response.CustomCoverage;
import br.com.sennatech.wasddoissuances.controller.dto.response.PolicyDetailsDTO;
import br.com.sennatech.wasddoissuances.domain.Validity;
import br.com.sennatech.wasddoissuances.service.dto.*;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ConverterCoverageDBtoCustomCoverage {

    public PolicyDetailsDTO convertToDetailsDTO(PolicyDB policyDB) {
        List<CustomCoverage> coverages = policyDB.getCoverages().stream()
                .map(this::convertCoverageDBToCustomCoverage)
                .collect(Collectors.toList());
        InsuredAddressDB insuredAddress = getInsuredAddress(policyDB.getInsuredAddresses());
        BigDecimal initialCoverageValue = policyDB.getTotalValue();

        return PolicyDetailsDTO.builder()
                .number(policyDB.getNumber())
                .documentNumber(policyDB.getHolderDocument())
                .value(initialCoverageValue)
                .paymentId(policyDB.getPaymentId())
                .coverages(coverages)
                .insuredAddresses(insuredAddress)
                .validity(new Validity(policyDB.getValidityStart(), policyDB.getValidityEnd()))
                .build();
    }

    private CustomCoverage convertCoverageDBToCustomCoverage(CoverageDB coverageDB) {
        CustomCoverage customCoverage = new CustomCoverage();
        customCoverage.setCode(Long.valueOf(coverageDB.getCoverageId()));
        customCoverage.setValue(coverageDB.getHiredValue());
        customCoverage.setName(customCoverage.getName());
        if (coverageDB.getCoverageCustomer() != null) {
            customCoverage.setName(coverageDB.getCoverageCustomer().getName());
        } else {
            customCoverage.setName("Nome Não Disponível");
        }
        return customCoverage;
    }


    private static InsuredAddressDB getInsuredAddress(InsuredAddressDB insuredAddress) {
        if (insuredAddress == null) {
            return null;
        }
        return InsuredAddressDB
                .builder()
                .street(insuredAddress.getStreet())
                .number(insuredAddress.getNumber())
                .district(insuredAddress.getDistrict())
                .city(insuredAddress.getCity())
                .state(insuredAddress.getState())
                .country(insuredAddress.getCountry())
                .zipcode(insuredAddress.getZipcode())
                .build();
    }
}
