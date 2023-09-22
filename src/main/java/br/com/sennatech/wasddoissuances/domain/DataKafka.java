package br.com.sennatech.wasddoissuances.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataKafka {
    PolicyDomain policy;
    HolderObj holder;
    InsuredAddress insuredAdress;
}
