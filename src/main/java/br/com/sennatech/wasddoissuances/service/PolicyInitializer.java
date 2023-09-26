package br.com.sennatech.wasddoissuances.service;

import br.com.sennatech.wasddoissuances.controller.dto.request.IssuanceRequestDTO;
import br.com.sennatech.wasddoissuances.domain.InsuredAddress;
import br.com.sennatech.wasddoissuances.domain.Policy;
import br.com.sennatech.wasddoissuances.domain.Validity;
import br.com.sennatech.wasddoissuances.service.converters.ConvertISAddressDTOToISAddress;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

@Service
@RequiredArgsConstructor
public class PolicyInitializer {

    private  final GetDate getDate;
    private final GetTotalValue getTotalValue;
    private final ConvertISAddressDTOToISAddress convertISAddress;

    public Policy getPolicy(IssuanceRequestDTO request){
        Integer number = ThreadLocalRandom.current().nextInt(1, 9999999 + 1);
        Policy policy = new Policy();
        policy.setNumber(number);
        Validity validity = new Validity(getDate.getDate(),getDate.calculateDate());
        policy.setValidity(validity);
        BigDecimal totalValue = getTotalValue.execute(request);
        policy.setTotalValue(totalValue);
        policy.setCoverages(request.coverages());
        return policy;



    }

}
