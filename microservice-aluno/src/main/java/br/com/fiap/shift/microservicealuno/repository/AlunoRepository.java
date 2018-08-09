package br.com.fiap.shift.microservicealuno.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.fiap.shift.microservicealuno.to.AlunoTO;

public interface AlunoRepository extends MongoRepository<AlunoTO, String> {


	
}
