package br.com.sennatech.wasddoquotation.controller;

import br.com.sennatech.wasddoquotation.domain.dto.FinalQuotationDTO;
import br.com.sennatech.wasddoquotation.domain.dto.QuotationParametersDTO;
import br.com.sennatech.wasddoquotation.service.CalculateQuotation;
import br.com.sennatech.wasddoquotation.service.GeneratesQuotationCode;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.RoundingMode;

@AllArgsConstructor
@RestController
@RequestMapping("/quotations")
public class QuotationController {

    private final CalculateQuotation calculateQuotation;
    private final GeneratesQuotationCode generatesQuotationCode;

    @PostMapping
    public ResponseEntity<FinalQuotationDTO>  quotation(@RequestBody  QuotationParametersDTO data) {
        String codetest = generatesQuotationCode.createCode();
        var value = calculateQuotation.quotationCalc(data).setScale(2, RoundingMode.HALF_EVEN);
        var finalQuotation = new FinalQuotationDTO(codetest, value);
        return ResponseEntity.ok().body(finalQuotation);


    }
}
