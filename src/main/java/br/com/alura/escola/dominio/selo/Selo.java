package br.com.alura.escola.dominio.selo;

import br.com.alura.escola.dominio.aluno.Cpf;

public class Selo {

	private Cpf cpfDoAluno;
	private String nome;

	public Selo(Cpf cpfDoAluno, String nome) {
		super();
		this.cpfDoAluno = cpfDoAluno;
		this.nome = nome;
	}

	public Cpf getCpfDoAluno() {
		return cpfDoAluno;
	}

	public String getNome() {
		return nome;
	}

}
