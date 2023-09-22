package br.com.sennatech.wasddoissuances.integration;

import br.com.sennatech.wasddoissuances.domain.DataKafka;
import lombok.Data;

@Data
public class ResponseKafkaDTO {
    String timestamp;
    String operation = "EMISSAO" ;
    String domain = "SEGURO";
    String origin = "SEGURATECH";
    DataKafka data;
}
