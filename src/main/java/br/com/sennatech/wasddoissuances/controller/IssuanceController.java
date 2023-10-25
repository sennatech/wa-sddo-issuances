package br.com.sennatech.wasddoissuances.controller;

import br.com.sennatech.wasddoissuances.controller.dto.request.IssuanceRequestDTO;
import br.com.sennatech.wasddoissuances.controller.dto.response.IssuanceResponseDTO;
import br.com.sennatech.wasddoissuances.controller.dto.response.PolicyDTO;
import br.com.sennatech.wasddoissuances.repository.PolicyRepository;
import br.com.sennatech.wasddoissuances.service.ConverterCoverageDBtoCustomCoverage;
import br.com.sennatech.wasddoissuances.service.IssuanceBusinessRulesService;
import br.com.sennatech.wasddoissuances.service.PolicyDTOtoPolicyResponse;
import br.com.sennatech.wasddoissuances.service.dto.PolicyDB;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Data
@RestController
@RequestMapping("/issuances")
public class IssuanceController {

    private final PolicyDTOtoPolicyResponse policyDTOtoPolicyResponse;
    private final ConverterCoverageDBtoCustomCoverage converter;
    private final PolicyRepository policyRepository;
    private final IssuanceBusinessRulesService issuanceBusinessRulesService;

    @PostMapping
    public ResponseEntity<IssuanceResponseDTO> getIssuance(@RequestBody IssuanceRequestDTO request) {
        System.out.println("[POST][ISSUANCE] " + request);
        final var response = issuanceBusinessRulesService.execute(request);
        return ResponseEntity.ok().body(response);
    }
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

}
