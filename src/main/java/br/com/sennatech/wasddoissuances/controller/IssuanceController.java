package br.com.sennatech.wasddoissuances.controller;

import br.com.sennatech.wasddoissuances.controller.dto.request.IssuanceRequestDTO;
import br.com.sennatech.wasddoissuances.domain.FinalIssuance;
import br.com.sennatech.wasddoissuances.domain.Policy;
import br.com.sennatech.wasddoissuances.service.IssuanceBusinessRulesService;
import br.com.sennatech.wasddoissuances.service.PolicyInitializer;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
@RequestMapping("/issuances")
public class IssuanceController {

    private final IssuanceBusinessRulesService issuanceBusinessRulesService;
    private final PolicyInitializer policyInitializer;

    @PostMapping
    public ResponseEntity<FinalIssuance> getIssuance(@RequestBody IssuanceRequestDTO request) {
        System.out.println("[POST][ISSUANCE] " + request);
        return ResponseEntity.ok().body(issuanceBusinessRulesService.execute(request));
    }
}
