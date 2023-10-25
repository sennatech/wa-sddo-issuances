package br.com.sennatech.wasddoissuances.service.dto;

import br.com.sennatech.wasddoissuances.service.dto.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @Column(nullable = false, updatable = false, unique = true, length = 11)
    private String documentNumber;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private LocalDate birthdate;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;
    @Column(nullable = false, length = 50)
    private String login;
    @Column(nullable = false, length = 50)
    private String password;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false, length = 2)
    private String areaCode;
    @Column(nullable = false, length = 9)
    private String phone;
}