package br.com.sennatech.wasddoissuances.domain;

import lombok.Data;

@Data
public class Address {
    String street;
    String number;
    String district;
    String city;
    String state;
    String country;
    String zipCode;
}
