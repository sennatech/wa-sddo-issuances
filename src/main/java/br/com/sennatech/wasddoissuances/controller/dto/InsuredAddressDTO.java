package br.com.sennatech.wasddoissuances.controller.dto;

public record InsuredAddressDTO(
        String street,
        String number,
        String district,
        String city,
        String state,
        String country,
        String zipcode
) {
}
