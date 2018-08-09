package br.com.fiap.shift.microservicealuno.to;

import java.io.Serializable;

public class AlunoTO implements Serializable {

	private static final long serialVersionUID = -7133168415973716527L;

	private String nome;
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
