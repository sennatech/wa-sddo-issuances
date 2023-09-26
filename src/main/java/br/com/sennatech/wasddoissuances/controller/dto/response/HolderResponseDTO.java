package br.com.sennatech.wasddoissuances.controller.dto.response;

import br.com.sennatech.wasddoissuances.domain.Address;

public record HolderResponseDTO(
        String documentNumber,
        String name,
        String birthdate,
        String gender,
        String email,
        String areaCode,
        String phone,
        Address address
) {
}