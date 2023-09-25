//package br.com.sennatech.wasddoissuances.service;
//
//import br.com.sennatech.wasddoissuances.controller.dto.RequestDTO;
//import br.com.sennatech.wasddoissuances.domain.Coverage;
//import br.com.sennatech.wasddoissuances.domain.Policy;
//import br.com.sennatech.wasddoissuances.domain.Validity;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.math.BigDecimal;
//import java.util.BitSet;
//import java.util.concurrent.ThreadLocalRandom;
//
//@Service
//@RequiredArgsConstructor
//public class ClassInitializerService {
//    private  final GetDate getDate;
//    private final GetTotalValue getTotalValue;
//    private final CoverageInitializer coverageInitializer;
//
//    public Policy policiInitializer(RequestDTO request){
//        Integer number = ThreadLocalRandom.current().nextInt(1, 9999999 + 1);
//        Coverage coverage = coverageInitializer.execute(request);
//        Policy policy = new Policy();
//        policy.setNumber(number);
//        policy.setCoverages(request.getCoverages());
//        BigDecimal totalValue = getTotalValue.execute(request);
//        Validity validity = new Validity(getDate.getDate(),getDate.calculateDate());
//
//
//    }
//
//}
