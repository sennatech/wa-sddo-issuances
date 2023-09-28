package br.com.sennatech.wasddoissuances.controller.dto.response;

import lombok.Data;

@Data
public class AddressDTO {
    private String street;
    private String number;
    private String district;
    private String city;
    private String state;
    private String country;
    private String zipCode;
}
