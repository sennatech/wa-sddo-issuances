package br.com.sennatech.wasddoissuances.domain;

import lombok.Data;

@Data
public class HolderObj {
    String documentNumber = "11111111111";
    String        name = "José do Teste";
    String        birthdate = "1992-01-01";
    String        gender = "M";
    String        email = "joao.teste@teste.com.br";
    String        areaCode = "11";
    String       phone = "912341234";
    Address   address;

}
