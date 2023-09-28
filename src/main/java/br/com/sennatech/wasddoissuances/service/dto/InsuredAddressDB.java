package br.com.sennatech.wasddoissuances.service.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@Table(name = "insuredAddresses")
@NoArgsConstructor
@AllArgsConstructor
public class InsuredAddressDB {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String street;
    private String number;
    private String district;
    private String city;
    private String state;
    private String country;
    private String zipcode;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "policy_number")
    private PolicyDB policy;
}
