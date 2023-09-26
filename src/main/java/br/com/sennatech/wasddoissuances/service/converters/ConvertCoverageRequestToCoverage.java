package br.com.sennatech.wasddoissuances.service.converters;

import br.com.sennatech.wasddoissuances.controller.dto.CoverageDTO;
import br.com.sennatech.wasddoissuances.domain.Coverage;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ConvertCoverageRequestToCoverage {
    private final ModelMapper mapper;

    public Coverage convert(CoverageDTO coverage){return mapper.map(coverage, Coverage.class);
    }
}
