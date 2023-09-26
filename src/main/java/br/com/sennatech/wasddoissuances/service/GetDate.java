package br.com.sennatech.wasddoissuances.service;

import br.com.sennatech.wasddoissuances.domain.Validity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Service
public class GetDate {
    private Validity validityDate;

    public String getDate(){

        return LocalDate.now().toString();
    }

    public String calculateDate(){
        LocalDate currentDate = LocalDate.now();

        return String.valueOf(currentDate.plus(1, ChronoUnit.YEARS));
    }
}
