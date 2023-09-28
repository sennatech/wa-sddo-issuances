package br.com.sennatech.wasddoissuances.domain;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Transient;

@Embeddable
@Data
@RequiredArgsConstructor
public class Holder {
    private String documentNumber;
    private String name;
    private String birthdate;
    private String gender;
    private String login;
    private String email;
    private String areaCode;
    private String phone;
    private Address address;
}
