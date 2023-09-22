package br.com.sennatech.wasddoissuances.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsuredAdress {
    String street;
    String number;
    String district;
    String city;
    String state;
    String country;
    String zipcode;
}
