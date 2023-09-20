package br.com.sennatech.wasddoquotation.service;


import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class GeneratesQuotationCode {
    public String createCode(){
        Integer randomNum = ThreadLocalRandom.current().nextInt(1, 9999999 + 1);
        String randomString = randomNum.toString();
        return String.format("%07d", Integer.parseInt(randomString));

    }
}
