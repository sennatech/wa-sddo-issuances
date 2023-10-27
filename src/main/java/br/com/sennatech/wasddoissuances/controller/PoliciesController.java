package br.com.sennatech.wasddoissuances.controller;

import br.com.sennatech.wasddoissuances.controller.dto.response.PolicyDTO;
import br.com.sennatech.wasddoissuances.controller.dto.response.PolicyDetailsDTO;
import br.com.sennatech.wasddoissuances.repository.PolicyRepository;
import br.com.sennatech.wasddoissuances.service.ConverterCoverageDBtoCustomCoverage;
import br.com.sennatech.wasddoissuances.service.PolicyDTOtoPolicyResponse;
import br.com.sennatech.wasddoissuances.service.dto.PolicyDB;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Data
@RestController
@RequestMapping("/policies")
public class PoliciesController {

    private final PolicyRepository policyRepository;
    private final PolicyDTOtoPolicyResponse policyDTOtoPolicyResponse;
    private final ConverterCoverageDBtoCustomCoverage converter;

    @GetMapping("/{holderDocument}")

    public ResponseEntity<List<PolicyDTO>>
    getPoliciesByHolderDocument(@PathVariable String holderDocument) {
        List<PolicyDB> policies = policyRepository.findByHolderDocument(holderDocument);
        List<PolicyDTO> policyDTOs = policies.stream()
                .map(policyDTOtoPolicyResponse::convertToDTO)
                .collect(Collectors.toList());
        System.out.println("[GET][POLICIES][DOCUMENTNUMBER] " + policyDTOs);
        return ResponseEntity.ok(policyDTOs);
    }


    @GetMapping("details/{number}")
    public ResponseEntity<List<PolicyDetailsDTO>> getPoliciesByNumber(@PathVariable Long number) {
        List<PolicyDB> policies = policyRepository.findByNumber(number);
        List<PolicyDetailsDTO> policyDetailsDTOs = new ArrayList<>();
        for (PolicyDB policy  : policies) {
            PolicyDetailsDTO policyDetailsDTO = converter.convertToDetailsDTO(policy);
            policyDetailsDTOs.add(policyDetailsDTO);
        }
        System.out.println("[GET][POLICIES][DETAILS NUMBER]" + policyDetailsDTOs);
        return ResponseEntity.ok(policyDetailsDTOs);
    }
}

