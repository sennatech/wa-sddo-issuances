package br.com.sennatech.wasddoissuances.domain;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Transient;

@Embeddable
@Data
@RequiredArgsConstructor
public class Holder {
    String documentNumber;
    String name;
    @Transient
    String birthdate;
    @Transient
    String gender;
    @Transient
    String login;
    @Transient
    String email;
    @Transient
    String areaCode;
    @Transient
    String phone;
    @Transient
    Address address;
}
