package br.com.sennatech.wasddoissuances.service.converters;

import br.com.sennatech.wasddoissuances.domain.InsuredAddress;
import br.com.sennatech.wasddoissuances.domain.dto.InsuredAddressDTO;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ConvertISAddressResourceToISAddress {
    private final ModelMapper mapper;

    public InsuredAddress convert(InsuredAddressDTO request){return mapper.map(request, InsuredAddress.class);}

}
