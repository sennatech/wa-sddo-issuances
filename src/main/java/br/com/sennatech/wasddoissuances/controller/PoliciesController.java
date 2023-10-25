package br.com.sennatech.wasddoissuances.controller;

import br.com.sennatech.wasddoissuances.controller.dto.response.PolicyDTO;
import br.com.sennatech.wasddoissuances.controller.dto.response.PolicyDetailsDTO;
import br.com.sennatech.wasddoissuances.repository.PolicyRepository;
import br.com.sennatech.wasddoissuances.service.PolicyDTOtoPolicyResponse;
import br.com.sennatech.wasddoissuances.service.dto.PolicyDB;
import br.com.sennatech.wasddoissuances.service.ConverterCoverageDBtoCustomCoverage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/policies")
public class PoliciesController {

    @Autowired
    private  PolicyRepository policyRepository;
    @Autowired
    private  PolicyDTOtoPolicyResponse policyDTOtoPolicyResponse;
    @Autowired
    private ConverterCoverageDBtoCustomCoverage converter;

    @GetMapping("/{holderDocument}")

    public ResponseEntity<List<PolicyDTO>>
    getPoliciesByHolderDocument(@PathVariable String holderDocument) {
        List<PolicyDB> policies = policyRepository.findByHolderDocument(holderDocument);
        List<PolicyDTO> policyDTOs = policies.stream()
                .map(policyDTOtoPolicyResponse::convertToDTO)
                .collect(Collectors.toList());


        System.out.println("[GET][POLICIES] " + policyDTOs);

        return ResponseEntity.ok(policyDTOs);
    }

    @GetMapping("details/{number}")
    public ResponseEntity<List<PolicyDetailsDTO>> getPoliciesByNumber(@PathVariable Long number) {
        List<PolicyDB> policies = policyRepository.findByNumber(number);
        List<PolicyDetailsDTO> policyDetailsDTOs = new ArrayList<>();

        for (PolicyDB policy : policies) {
            PolicyDetailsDTO policyDetailsDTO = converter.convertToDetailsDTO(policy);
            policyDetailsDTOs.add(policyDetailsDTO);
        }

        System.out.println("[GET][POLICIES] " + policyDetailsDTOs);

        return ResponseEntity.ok(policyDetailsDTOs);
    }
}

