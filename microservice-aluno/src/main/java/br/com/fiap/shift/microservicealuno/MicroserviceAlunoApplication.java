package br.com.fiap.shift.microservicealuno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class MicroserviceAlunoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceAlunoApplication.class, args);
	}
}
