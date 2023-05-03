package br.com.alura.escola.dominio.aluno.exceptions;

import br.com.alura.escola.dominio.aluno.Cpf;

public class AlunoNaoEncontradoException extends RuntimeException {

	public AlunoNaoEncontradoException(Cpf cpf) {
		super(cpf.toString());
	}

	private static final long serialVersionUID = 1L;

}
