package br.com.sennatech.wasddoissuances.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsuredAddressDTO {
    String street;
    String number;
    String district;
    String city;
    String state;
    String country;
    String zipcode;
}
