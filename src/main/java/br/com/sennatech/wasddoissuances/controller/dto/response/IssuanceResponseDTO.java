package br.com.sennatech.wasddoissuances.controller.dto.response;

import br.com.sennatech.wasddoissuances.controller.dto.InsuredAddressDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IssuanceResponseDTO {
    PolicyResponseDTO policy;
    HolderResponseDTO holder;
    InsuredAddressDTO insuredAddress;
}
