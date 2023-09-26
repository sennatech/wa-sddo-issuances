package br.com.sennatech.wasddoissuances;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class WaSddoIssuancesApplication {

	public static void main(String[] args) {
		SpringApplication.run(WaSddoIssuancesApplication.class, args);
	}

}
