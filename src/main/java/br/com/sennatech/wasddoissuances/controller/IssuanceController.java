package br.com.sennatech.wasddoissuances.controller;

import br.com.sennatech.wasddoissuances.controller.dto.request.IssuanceRequestDTO;
import br.com.sennatech.wasddoissuances.controller.dto.response.IssuanceResponseDTO;
import br.com.sennatech.wasddoissuances.service.IssuanceBusinessRulesService;
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

    @PostMapping
    public ResponseEntity<IssuanceResponseDTO> getIssuance(@RequestBody IssuanceRequestDTO request) {
        System.out.println("[POST][ISSUANCE] " + request);
        final var response = issuanceBusinessRulesService.execute(request);
        return ResponseEntity.ok().body(response);
    }
}
