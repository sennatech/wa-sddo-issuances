package br.com.sennatech.wasddoissuances.domain;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Validity {
    String start ;
    String end;
}
