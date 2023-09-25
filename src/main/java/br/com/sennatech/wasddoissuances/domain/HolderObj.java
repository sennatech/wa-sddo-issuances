package br.com.sennatech.wasddoissuances.domain;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
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
//{
//        "documentNumber": "11111111111",
//        "name": "José do Teste",
//        "birthdate": "1992-01-01",
//        "gender": "M",
//        "login": "teste",
//        "email": "joao.teste@teste.com.br",
//        "areaCode": "11",
//        "phone": "912341234",
//        "address": {
//        "street": "Rua dos testes",
//        "number": "1",
//        "neighbourhood": "Vila dos teste",
//        "city": "São paulo",
//        "state": "SP",
//        "country": "Brasil",
//        "zipCode": "12345123"
//        }
//        }
