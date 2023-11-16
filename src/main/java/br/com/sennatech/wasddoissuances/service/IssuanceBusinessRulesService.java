package br.com.sennatech.wasddoissuances.service;

import br.com.sennatech.wasddoissuances.controller.dto.request.IssuanceRequestDTO;
import br.com.sennatech.wasddoissuances.controller.dto.response.IssuanceResponseDTO;
import br.com.sennatech.wasddoissuances.integration.kafka.KafkaProducer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class IssuanceBusinessRulesService {

    private final SavePolicyService savePolicyService;
    private final GetIssuanceService getPolicy;
    private final GetCustumerByDocumentNumberService getCustumerIntegration;
    private final KafkaProducer kafkaProducer;
    private final ConvertIssuanceToIssuanceResponseDTO convertIssuanceToIssuanceResponseDTO;

    public IssuanceResponseDTO execute(IssuanceRequestDTO request){
        final var policyDB = savePolicyService.execute(request);
        final var holder = getCustumerIntegration.execute(request.getDocumentNumber());
        final var issuance = getPolicy.execute(request, policyDB, holder);
        final var issuanceResponseDTO = convertIssuanceToIssuanceResponseDTO.execute(issuance);

        kafkaProducer.send(issuance);
        return issuanceResponseDTO;
    }
}

