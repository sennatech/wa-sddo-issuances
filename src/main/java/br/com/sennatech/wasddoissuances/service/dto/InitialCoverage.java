package br.com.sennatech.wasddoissuances.service.dto;

import br.com.sennatech.wasddoissuances.service.dto.enums.Type;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class InitialCoverage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, updatable = false, nullable = false)
    private Long id;
    @Column(unique = true, length = 50)
    private String name;
    @Column(length = 100, nullable = false)
    private String description;
    @Column(nullable = false)
    private Double value;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Type type;
    @Column(nullable = false)
    private Double sumInsured;
    @Column(nullable = false)
    private Boolean required;
    @OneToOne
    @JoinColumn(name = "coverage_id")
    @JsonBackReference
    private CoverageDB coverageCustomer;
}
