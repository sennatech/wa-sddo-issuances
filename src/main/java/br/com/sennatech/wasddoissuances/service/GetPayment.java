package br.com.sennatech.wasddoissuances.service;

import br.com.sennatech.wasddoissuances.service.dto.PaymentDB;
import br.com.sennatech.wasddoissuances.service.integration.GetPaymentIntegration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetPayment {
    @Autowired
    private GetPaymentIntegration getPaymentIntegration;

    public PaymentDB execute(Long paymentId){
        return getPaymentIntegration.getAPayment(paymentId);
 }

}
