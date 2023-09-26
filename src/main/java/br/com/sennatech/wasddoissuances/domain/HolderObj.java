package br.com.sennatech.wasddoissuances.domain;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class HolderObj {
    String documentNumber;
    String name;
    String birthdate;
    String gender;
    String login;
    String email;
    String areaCode;
    String phone;
    Address address;

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

