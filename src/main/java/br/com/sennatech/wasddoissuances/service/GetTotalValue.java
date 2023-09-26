package br.com.sennatech.wasddoissuances.service;

import br.com.sennatech.wasddoissuances.controller.dto.request.IssuanceRequestDTO;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Data
@Service
public class GetTotalValue {
    public BigDecimal execute(IssuanceRequestDTO issuanceRequestDTO){
        BigDecimal coverageSum = issuanceRequestDTO.coverages().stream().map(coverage -> coverage.getValue()).reduce(BigDecimal::add).get();
        return  coverageSum;
    }
}
