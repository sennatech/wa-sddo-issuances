package br.com.sennatech.wasddoissuances.service.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "payment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDB {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, updatable = false, nullable = false)
    private Long id;
    @Column(nullable = false, length = 50)
    private String transaction;
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal paymentValue;
    @Column(nullable = false)
    private LocalDateTime dateTime = LocalDateTime.now();
}
