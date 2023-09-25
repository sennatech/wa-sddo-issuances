package br.com.sennatech.wasddoissuances.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class GetDate {
    public String getDate(){
       return LocalDateTime.now().toString();
    }
}
