package br.com.sennatech.wasddoissuances.service.integration;

import br.com.sennatech.wasddoissuances.repository.PaymentRepository;
import br.com.sennatech.wasddoissuances.service.dto.PaymentDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetPaymentIntegration {
    private final PaymentRepository paymentRepository;

    @Autowired
    public GetPaymentIntegration(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }
    public PaymentDB getAPayment(Long paymentId) {
        return paymentRepository.findById(paymentId).orElse(null);
    }
}
