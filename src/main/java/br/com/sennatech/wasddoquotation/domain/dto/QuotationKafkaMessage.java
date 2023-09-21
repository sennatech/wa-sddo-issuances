package br.com.sennatech.wasddoquotation.domain.dto;

import br.com.sennatech.wasddoquotation.domain.DataQuotation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class QuotationKafkaMessage {
    String timestamp;
    String operation = "COTACAO" ;
    String domain = "SEGURO";
    String origin = "SEGURATECH";
    DataQuotation data;
}
