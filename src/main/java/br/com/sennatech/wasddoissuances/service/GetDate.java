package br.com.sennatech.wasddoissuances.service;

import br.com.sennatech.wasddoissuances.domain.Validity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Service
public class GetDate {
    private Validity validityDate;

    public String getDate(){

        return LocalDateTime.now().toString();
    }

    public String calculateDate(){
        LocalDateTime currentDate = LocalDateTime.now();
        String calculatedDate = String.valueOf(currentDate.plus(1, ChronoUnit.YEARS));

        return calculatedDate;
    }
}
