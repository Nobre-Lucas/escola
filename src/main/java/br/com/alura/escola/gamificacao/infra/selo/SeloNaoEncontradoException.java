package br.com.alura.escola.gamificacao.infra.selo;

public class SeloNaoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public SeloNaoEncontradoException(String nome) {
		super("O selo com nome " + nome + " não foi encontrado!");
	}

}
