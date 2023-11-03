package br.com.sennatech.wasddoissuances.domain;

import lombok.Data;

@Data
public class Address {
    private String street;
    private String number;
    private String neighbourhood;
    private String city;
    private String state;
    private String country;
    private String zipcode;
}
