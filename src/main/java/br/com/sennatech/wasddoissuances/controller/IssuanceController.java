package br.com.sennatech.wasddoissuances.controller;

import br.com.sennatech.wasddoissuances.domain.DataKafka;
import br.com.sennatech.wasddoissuances.domain.dto.RequestDTO;
import br.com.sennatech.wasddoissuances.domain.dto.ResponseDTO;
import br.com.sennatech.wasddoissuances.integration.KafkaProducer;
import br.com.sennatech.wasddoissuances.integration.ResponseKafkaDTO;
import br.com.sennatech.wasddoissuances.service.GetDate;
import br.com.sennatech.wasddoissuances.service.converters.ConvertISAddressResourceToISAddress;
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

    private final KafkaProducer kafkaProducer;
    private final ConvertISAddressResourceToISAddress converter;
    private final GetDate date;
    @PostMapping
    public ResponseEntity<ResponseDTO> issuance(@RequestBody RequestDTO dataDTO){
        ResponseDTO responseDTO = new ResponseDTO();
        var addressDTOConverted = converter.convert(dataDTO.getInsuredAddress());
        responseDTO.setInsuredAdress(addressDTOConverted);
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println(dataDTO.getInsuredAddress());
        System.out.println(responseDTO.getInsuredAdress());
        DataKafka dataKafka = new DataKafka();
        dataKafka.setInsuredAdress(responseDTO.getInsuredAdress());
        ResponseKafkaDTO responseKafkaDTO = new ResponseKafkaDTO();
        responseKafkaDTO.setTimestamp(date.getDate());
        responseKafkaDTO.setData(dataKafka);
        kafkaProducer.send(responseKafkaDTO);
        return  ResponseEntity.ok().body(responseDTO);

    }
}
