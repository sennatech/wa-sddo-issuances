package br.com.sennatech.wasddoquotation.service;

import br.com.sennatech.wasddoquotation.domain.dto.QuotationResquestDTO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class CalculateQuotation {

        public BigDecimal quotationCalc(QuotationResquestDTO data) {
          var coverageSum = data.getCoverages()
                 .stream()
                 .map(coverage -> coverage.value())
                 .reduce(BigDecimal::add).get();
          if (data.getCoverages().size() > 2){
              coverageSum = coverageSum.multiply(new BigDecimal(0.8));
              return coverageSum;
          }
          return coverageSum.setScale(2,RoundingMode.HALF_EVEN);
        }
}
