package br.com.alura.escola.dominio.aluno;

public class AlunoNaoEncontrado extends RuntimeException {

	public AlunoNaoEncontrado(Cpf cpf) {
		super(cpf.getCpfValue());
	}

	private static final long serialVersionUID = 1L;

}
