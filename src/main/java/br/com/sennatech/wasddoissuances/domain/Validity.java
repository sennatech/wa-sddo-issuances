package br.com.sennatech.wasddoissuances.domain;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Validity {
    String start ;
    String end;

}
