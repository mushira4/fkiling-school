package br.com.fiap.shift.microservicealuno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.shift.microservicealuno.repository.AlunoRepo;
import br.com.fiap.shift.microservicealuno.to.AlunoTO;

@RestController
public class AlunoService {

	@Autowired
	private AlunoRepo repository;

	@RequestMapping("/aluno")
	public AlunoTO aluno() {

		final AlunoTO to = new AlunoTO();

		to.setEmail("Email");
		to.setNome("Nome");

		repository.save(to);

		return to;
	}

}
