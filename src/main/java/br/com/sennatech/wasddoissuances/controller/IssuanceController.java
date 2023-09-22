package br.com.sennatech.wasddoissuances.controller;

import br.com.sennatech.wasddoissuances.domain.dto.RequestDTO;
import br.com.sennatech.wasddoissuances.domain.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/issuances")
public class IssuanceController {
    @PostMapping
    public ResponseEntity<RequestDTO> issuance(@RequestBody RequestDTO dataDTO){

        return  ResponseEntity.ok().body(dataDTO);

    }
}
