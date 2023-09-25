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

    public void calculateDate(){
        LocalDateTime currentDate = LocalDateTime.now();
        LocalDateTime calculatedDate = currentDate.plus(1, ChronoUnit.YEARS);

        validityDate.setStart(String.valueOf(currentDate));
        validityDate.setEnd(String.valueOf(calculatedDate));
    }
}
