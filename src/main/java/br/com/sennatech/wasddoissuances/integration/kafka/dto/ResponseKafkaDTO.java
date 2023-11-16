package br.com.sennatech.wasddoissuances.integration.kafka.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseKafkaDTO {
    String  timestamp = new SimpleDateFormat("yyyy-HH-dd HH:MM:ss").format(new Date());
    String operation = "EMISSAO" ;
    String domain = "SEGURO";
    String origin = "ASSEGURAÊ";
    KafkaData data;
}
