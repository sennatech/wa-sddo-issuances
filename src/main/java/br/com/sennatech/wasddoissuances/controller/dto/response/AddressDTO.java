package br.com.sennatech.wasddoissuances.controller.dto.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {
    String street;
    String number;
    String district;
    String city;
    String state;
    String country;
    String zipCode;
}
