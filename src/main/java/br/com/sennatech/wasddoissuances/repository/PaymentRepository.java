package br.com.sennatech.wasddoissuances.repository;

import br.com.sennatech.wasddoissuances.domain.Payment;
import br.com.sennatech.wasddoissuances.service.dto.PaymentDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PaymentRepository extends JpaRepository<PaymentDB, Long> {

}
