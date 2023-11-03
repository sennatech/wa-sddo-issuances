package br.com.sennatech.wasddoissuances.service;

import br.com.sennatech.wasddoissuances.controller.dto.CoverageDTO;
import br.com.sennatech.wasddoissuances.controller.dto.InsuredAddressDTO;
import br.com.sennatech.wasddoissuances.controller.dto.response.HolderResponseDTO;
import br.com.sennatech.wasddoissuances.controller.dto.response.IssuanceResponseDTO;
import br.com.sennatech.wasddoissuances.controller.dto.response.PolicyResponseDTO;
import br.com.sennatech.wasddoissuances.controller.dto.response.ValidityResponseDTO;
import br.com.sennatech.wasddoissuances.domain.*;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ConvertIssuanceToIssuanceResponseDTO {

    private final ModelMapper mapper;

    public IssuanceResponseDTO execute(Issuance issuance) {
        return IssuanceResponseDTO
                .builder()
                .policy(getPolicy(issuance.getPolicy()))
                .holder(getHolder(issuance.getHolder()))
                .insuredAddress(getInsuredAddress(issuance.getInsuredAddress()))
                .build();
    }

    private PolicyResponseDTO getPolicy(Policy policy) {
        return PolicyResponseDTO
                .builder()
                .number(policy.getNumber())
                .validity(new ValidityResponseDTO(policy.getValidity().getStart(), policy.getValidity().getEnd()))
                .amount(getAmount(policy.getCoverages()))
                .coverages(getcoverages(policy.getCoverages()))
                .build();
    }

    private List<CoverageDTO> getcoverages(List<Coverage> coverages) {
        return coverages
                .stream()
                .map(coverage -> getcoverage(coverage))
                .collect(Collectors.toList());
    }

    private CoverageDTO getcoverage(Coverage coverage) {
        return CoverageDTO
                .builder()
                .code(coverage.getCode())
                .type(coverage.getType())
                .name(coverage.getName())
                .description(coverage.getDescription())
                .amount(coverage.getAmount())
                .sumInsured(coverage.getSumInsured())
                .required(coverage.isRequired())
                .build();
    }

    private HolderResponseDTO getHolder(Holder holder) {
        return mapper.map(holder, HolderResponseDTO.class);
    }

    private InsuredAddressDTO getInsuredAddress(InsuredAddress insuredAddress) {
        return mapper.map(insuredAddress, InsuredAddressDTO.class);
    }

    private BigDecimal getAmount(List<Coverage> coverages) {
        BigDecimal totalAmount = BigDecimal.ZERO;

        for (Coverage coverage : coverages) {
            totalAmount = totalAmount.add(coverage.getAmount());
        }

        return totalAmount;
    }
}
