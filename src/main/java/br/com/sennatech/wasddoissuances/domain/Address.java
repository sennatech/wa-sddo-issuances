package br.com.sennatech.wasddoissuances.domain;

import lombok.Data;

@Data
public class Address {
    String street = "Rua dos testes";
    String        number = "S/N";
    String        district = "Vila dos teste";
    String        city = "São paulo";
    String        state= "SP";
    String        country = "Brasil";
    String        zipCode= "12345123";
}
