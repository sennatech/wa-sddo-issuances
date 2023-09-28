package br.com.sennatech.wasddoissuances.service.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@Entity
@Table(name = "coverages")
@NoArgsConstructor
@AllArgsConstructor
public class CoverageDB {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private Integer coverageId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "policy_number")
    private PolicyDB policy;
    private  BigDecimal hiredValue;
}
