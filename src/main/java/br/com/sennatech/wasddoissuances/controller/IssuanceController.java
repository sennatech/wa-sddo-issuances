package br.com.sennatech.wasddoissuances.controller;

import br.com.sennatech.wasddoissuances.domain.dto.RequestDTO;
import br.com.sennatech.wasddoissuances.domain.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/issuances")
public class IssuanceController {
    @PostMapping
    public String issuance(@RequestBody RequestDTO dataDTO){
        return  "foi";

    }
}
