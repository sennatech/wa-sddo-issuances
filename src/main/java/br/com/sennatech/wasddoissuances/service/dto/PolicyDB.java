package br.com.sennatech.wasddoissuances.service.dto;

import br.com.sennatech.wasddoissuances.controller.dto.InsuredAddressDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@Entity
@Table(name = "policies")
@AllArgsConstructor
@NoArgsConstructor
public class PolicyDB {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long number;
    private String validityStart ;
    private String validityEnd;
    private BigDecimal totalValue;
    private String holderDocument;
    private String paymentId;
    @OneToMany(mappedBy = "policy", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CoverageDB> coverages;
    @OneToOne(mappedBy = "policy", cascade = CascadeType.ALL, orphanRemoval = true)
    private InsuredAddressDB insuredAddress;
}
