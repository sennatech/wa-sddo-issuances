package br.com.sennatech.wasddoissuances.controller.dto.response;

import br.com.sennatech.wasddoissuances.domain.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
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
    Address address;
}