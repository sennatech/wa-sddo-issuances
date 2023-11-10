package br.com.sennatech.wasddoissuances.repository;

import br.com.sennatech.wasddoissuances.service.dto.CoverageDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface NameCoverageRepository extends JpaRepository<CoverageDB, Long> {

}
