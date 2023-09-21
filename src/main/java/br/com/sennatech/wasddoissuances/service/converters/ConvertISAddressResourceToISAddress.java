package br.com.sennatech.wasddoissuances.service.converters;

import br.com.sennatech.wasddoissuances.domain.InsuredAdress;
import br.com.sennatech.wasddoissuances.domain.dto.InsuredAddressDTO;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ConvertISAddressResourceToISAddress {
    private final ModelMapper mapper;

    public InsuredAdress convert(InsuredAddressDTO request){return mapper.map(request, InsuredAdress.class);}

}
