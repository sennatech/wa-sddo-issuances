package br.com.sennatech.wasddoissuances.service;

import br.com.sennatech.wasddoissuances.domain.Validity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Service
public class GetValidityDate {

    public String getDate(){
        return LocalDate.now().toString();
    }

    public String calculateDate(){
        return LocalDate.now().plusYears(1).toString();
    }
}
