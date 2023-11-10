package br.com.sennatech.wasddoissuances.service.integration;

import br.com.sennatech.wasddoissuances.repository.NameCoverageRepository;
import br.com.sennatech.wasddoissuances.service.dto.InitialCoverage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetNametIntegration {
    private final NameCoverageRepository nameCoverageRepository;

    @Autowired
    public GetNametIntegration(NameCoverageRepository nameCoverageRepository) {
        this.nameCoverageRepository = nameCoverageRepository;
    }
    public InitialCoverage getName(Long id) {
        return nameCoverageRepository.findById(id).orElse(null).getCoverageCustomer();
    }
}
