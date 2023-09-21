package br.com.sennatech.wasddoquotation.controller;

import br.com.sennatech.wasddoquotation.domain.DataQuotation;
import br.com.sennatech.wasddoquotation.domain.FinalQuotationResponse;
import br.com.sennatech.wasddoquotation.domain.dto.QuotationKafkaMessage;
import br.com.sennatech.wasddoquotation.domain.dto.QuotationResquestDTO;
import br.com.sennatech.wasddoquotation.integration.KafkaProducer;
import br.com.sennatech.wasddoquotation.service.CalculateQuotation;
import br.com.sennatech.wasddoquotation.service.GeneratesQuotationCode;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.RoundingMode;
import java.time.LocalDateTime;

@RequiredArgsConstructor
@RestController
@RequestMapping("/quotations")
public class QuotationController {

    private final CalculateQuotation calculateQuotation;
    private final GeneratesQuotationCode generatesQuotationCode;
    private final KafkaProducer kafkaProducer;


    @PostMapping
    public ResponseEntity<FinalQuotationResponse>  quotation(@RequestBody QuotationResquestDTO dataDTO) {
        String codetest = generatesQuotationCode.createCode();
        var value = calculateQuotation.quotationCalc(dataDTO).setScale(2, RoundingMode.HALF_EVEN);
        var finalQuotation = new QuotationKafkaMessage();
        finalQuotation.setTimestamp(LocalDateTime.now().toString());
        finalQuotation.setData(new DataQuotation(codetest,value));
        this.kafkaProducer.send(finalQuotation);
        return ResponseEntity.ok().body(new FinalQuotationResponse(codetest,value));


    }
}
