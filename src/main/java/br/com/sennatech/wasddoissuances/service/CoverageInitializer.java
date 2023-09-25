//package br.com.sennatech.wasddoissuances.service;
//
//import br.com.sennatech.wasddoissuances.controller.dto.RequestDTO;
//import br.com.sennatech.wasddoissuances.domain.Coverage;
//import org.json.JSONArray;
//import org.json.JSONObject;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class CoverageInitializer {
//
//    public Coverage execute(RequestDTO request){
//
//        JSONObject jsonObject = new JSONObject(request);
//        Coverage individualCoverage = new Coverage();
//        JSONArray coveragesArray = request.j;
//        List<Integer> coverageCodes = new ArrayList<>();
//        for (int i = 0; i < coveragesArray.length(); i++) {
//            JSONObject coverage = coveragesArray.getJSONObject(i);
////        individualCoverage.setCode(request.getCoverages().stream().forEach(coverage -> coverage.getCode()));
//
//
//    }
//}
