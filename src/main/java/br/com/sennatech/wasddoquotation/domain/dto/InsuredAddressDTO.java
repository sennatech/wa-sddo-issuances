package br.com.sennatech.wasddoquotation.domain.dto;

import jakarta.validation.constraints.NotBlank;

public record InsuredAddressDTO(@NotBlank String street,@NotBlank String number,@NotBlank String district,@NotBlank String city,@NotBlank String state,@NotBlank String country,@NotBlank String zipcode) {
}
