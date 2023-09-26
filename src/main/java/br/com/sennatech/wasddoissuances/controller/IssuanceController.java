package br.com.sennatech.wasddoissuances.controller;

import br.com.sennatech.wasddoissuances.controller.dto.request.IssuanceRequestDTO;
import br.com.sennatech.wasddoissuances.controller.dto.response.IssuanceResponseDTO;
import br.com.sennatech.wasddoissuances.controller.dto.response.PolicyResponseDTO;
import br.com.sennatech.wasddoissuances.integration.KafkaProducer;
import br.com.sennatech.wasddoissuances.service.GetDate;
import br.com.sennatech.wasddoissuances.service.IssuanceBusinessRulesService;
import br.com.sennatech.wasddoissuances.service.converters.ConvertISAddressResourceToISAddress;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@Data
@RestController
@RequestMapping("/issuances")
public class IssuanceController {

    private final IssuanceBusinessRulesService issuanceBusinessRulesService;

    @PostMapping
    public ResponseEntity<IssuanceResponseDTO> getIssuance(@RequestBody IssuanceRequestDTO request) {
        System.out.println("[POST][ISSUANCE] " + request);
        issuanceBusinessRulesService.execute(request);
        return ResponseEntity.ok().body(null);
    }






    private final KafkaProducer kafkaProducer;
    private final ConvertISAddressResourceToISAddress converter;
    private final GetDate date;

//    @PostMapping("/teste")
//    public ResponseEntity<ResponseDTO> issuance(@RequestBody IssuanceRequestDTO dataDTO) {
//        ResponseDTO responseDTO = new ResponseDTO();
//        var addressDTOConverted = converter.convert(dataDTO.getInsuredAddress());
//        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
//        System.out.println(dataDTO.getInsuredAddress());
//
//        DataKafka dataKafka = new DataKafka();
//        ResponseKafkaDTO responseKafkaDTO = new ResponseKafkaDTO();
//        responseKafkaDTO.setTimestamp(date.getDate());
//        responseKafkaDTO.setData(dataKafka);
//        date.calculateDate();
//        kafkaProducer.send(responseKafkaDTO);
//        return ResponseEntity.ok().build();
//    }
}
