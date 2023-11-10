package br.com.sennatech.wasddoissuances.service.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@Builder
@Entity
@Table(name = "Hired_coverages")
@NoArgsConstructor
@AllArgsConstructor
public class CoverageDB {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private Integer coverageId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "policy_number")
    @JsonBackReference
    private PolicyDB policy;
    private BigDecimal hiredAmount;
    @ManyToOne
    @JoinColumn(name = "coverageId", referencedColumnName = "id", insertable = false, updatable = false)
    private InitialCoverage coverageCustomer;
}
