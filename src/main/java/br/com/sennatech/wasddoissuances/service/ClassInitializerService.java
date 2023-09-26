package br.com.sennatech.wasddoissuances.service;

import br.com.sennatech.wasddoissuances.controller.dto.request.IssuanceRequestDTO;
import br.com.sennatech.wasddoissuances.domain.Policy;
import br.com.sennatech.wasddoissuances.domain.Validity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

@Service
@RequiredArgsConstructor
public class ClassInitializerService {

    private  final GetDate getDate;
    private final GetTotalValue getTotalValue;

    public Policy policiInitializer(IssuanceRequestDTO request){
        Integer number = ThreadLocalRandom.current().nextInt(1, 9999999 + 1);
        Policy policy = new Policy();
        policy.setNumber(number);
        Validity validity = new Validity(getDate.getDate(),getDate.calculateDate());
        policy.setValidity(validity);
        BigDecimal totalValue = getTotalValue.execute(request);
        policy.setTotalValue(totalValue);
        policy.setCoverages(request.coverages());
//        policy.setInsuredAdress(request.getInsuredAddress());
        return policy;



    }

}
