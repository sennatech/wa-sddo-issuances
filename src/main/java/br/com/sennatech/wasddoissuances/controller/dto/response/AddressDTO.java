package br.com.sennatech.wasddoissuances.controller.dto.response;

public record AddressDTO(
        String street,
        String number,
        String district,
        String city,
        String state,
        String country,
        String zipCode
) {
}
