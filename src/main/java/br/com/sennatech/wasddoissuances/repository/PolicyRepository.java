package br.com.sennatech.wasddoissuances.repository;

import br.com.sennatech.wasddoissuances.service.dto.PolicyDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyRepository extends JpaRepository<PolicyDB, Long> {
}
