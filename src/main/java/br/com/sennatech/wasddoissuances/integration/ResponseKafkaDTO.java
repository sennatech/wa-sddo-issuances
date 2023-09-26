package br.com.sennatech.wasddoissuances.integration;

import br.com.sennatech.wasddoissuances.integration.dto.DataKafka;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseKafkaDTO {
    String timestamp;
    String operation = "EMISSAO" ;
    String domain = "SEGURO";
    String origin = "SEGURATECH";
    DataKafka data;
}
