package br.com.sennatech.wasddoissuances.integration;

import br.com.sennatech.wasddoissuances.domain.DataKafka;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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
