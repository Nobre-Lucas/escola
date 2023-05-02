package br.com.alura.escola.dominio.aluno.exceptions;

public class NumeroMaximoDeTelefonesException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NumeroMaximoDeTelefonesException(int numeroMaximoDeTelefones) {
		super("O aluno já possui " + numeroMaximoDeTelefones + " números de telefone e não pode ter mais que isso");
	}

}
