package br.com.sennatech.wasddoissuances.service;

import br.com.sennatech.wasddoissuances.controller.dto.InsuredAddressDTO;
import br.com.sennatech.wasddoissuances.controller.dto.response.CustomCoverage;
import br.com.sennatech.wasddoissuances.controller.dto.response.PolicyDetailsDTO;
import br.com.sennatech.wasddoissuances.domain.Validity;
import br.com.sennatech.wasddoissuances.service.dto.CoverageDB;
import br.com.sennatech.wasddoissuances.service.dto.InsuredAddressDB;
import br.com.sennatech.wasddoissuances.service.dto.PolicyDB;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ConverterCoverageDBtoCustomCoverage {

    public PolicyDetailsDTO convertToDetailsDTO(PolicyDB policyDB) {
        List<CustomCoverage> coverages = policyDB.getCoverages().stream()
                .map(this::convertCoverageDBToCustomCoverage)
                .collect(Collectors.toList());
        return PolicyDetailsDTO.builder()
                .number(policyDB.getNumber())
                .documentNumber(policyDB.getHolderDocument())
                .value(policyDB.getTotalValue())
                .paymentId(policyDB.getPaymentId())
                .coverages(coverages)
                .validity(new Validity(policyDB.getValidityStart(), policyDB.getValidityEnd()))
                .insuredAddresses((List<InsuredAddressDB>) policyDB.getInsuredAddress())
                .build();
    }

    private CustomCoverage convertCoverageDBToCustomCoverage(CoverageDB coverageDB) {
        CustomCoverage customCoverage = new CustomCoverage();
        customCoverage.setCode(Long.valueOf(coverageDB.getCoverageId()));
        customCoverage.setValue(coverageDB.getHiredValue());

        return customCoverage;
    }

    private InsuredAddressDTO convertInsuredAddressDBToDTO(InsuredAddressDB insuredAddressDB) {
        InsuredAddressDTO insuredAddressDTO = new InsuredAddressDTO();
        insuredAddressDTO.setNumber(insuredAddressDB.getNumber());
        insuredAddressDTO.setDistrict(insuredAddressDB.getDistrict());
        insuredAddressDTO.setCity(insuredAddressDB.getCity());
        insuredAddressDTO.setState(insuredAddressDB.getState());
        insuredAddressDTO.setCountry(insuredAddressDB.getCountry());
        insuredAddressDTO.setZipcode(insuredAddressDB.getZipcode());
        return insuredAddressDTO;
    }
    private List<InsuredAddressDTO> convertInsuredAddresses(List<InsuredAddressDB> insuredAddresses) {
        return insuredAddresses.stream()
                .map(this::convertInsuredAddressDBToDTO)
                .collect(Collectors.toList());
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
