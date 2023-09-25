//package br.com.sennatech.wasddoissuances.service;
//
//import br.com.sennatech.wasddoissuances.controller.dto.RequestDTO;
//import br.com.sennatech.wasddoissuances.domain.Coverage;
//
//import java.math.BigDecimal;
//
//public class GetTotalValue {
//    public BigDecimal execute(RequestDTO requestDTO){
//        BigDecimal coverageSum = requestDTO.getCoverages().stream().map(coverage -> coverage.getValue()).reduce(BigDecimal::add).get();
//    }
//}
