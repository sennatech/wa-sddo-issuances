package br.com.sennatech.wasddoissuances.service.converters;

import br.com.sennatech.wasddoissuances.domain.Coverage;
import br.com.sennatech.wasddoissuances.controller.dto.CoverageResource;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ConvertCoverageRequestToCoverage {
    private final ModelMapper mapper;

    public Coverage convert(CoverageResource coverage){return mapper.map(coverage, Coverage.class);
    }
}
