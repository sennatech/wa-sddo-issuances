package br.com.sennatech.wasddoissuances.domain;

import lombok.Data;

@Data
public class DataKafka {
    PolicyDomain policy;
    HolderObj holder;
    InsuredAdress insuredAdress;
}
