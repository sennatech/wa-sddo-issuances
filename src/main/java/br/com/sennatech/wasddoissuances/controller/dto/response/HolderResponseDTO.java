package br.com.sennatech.wasddoissuances.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HolderResponseDTO {
    String documentNumber;
    String name;
    String birthdate;
    String gender;
    String email;
    String areaCode;
    String phone;
    AddressDTO address;
}