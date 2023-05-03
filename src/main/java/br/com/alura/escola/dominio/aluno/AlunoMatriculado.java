package br.com.alura.escola.dominio.aluno;

import java.time.LocalDateTime;

import br.com.alura.escola.dominio.Evento;

public class AlunoMatriculado implements Evento {

	private final Cpf cpfDoAluno;
	private LocalDateTime momentoQueFoiChamado;

	public AlunoMatriculado(Cpf cpfDoAluno) {
		this.cpfDoAluno = cpfDoAluno;
		this.momentoQueFoiChamado = LocalDateTime.now();
	}

	@Override
	public LocalDateTime momentoQueFoiChamado() {
		return this.momentoQueFoiChamado;
	}

	public Cpf getCpfDoAluno() {
		return cpfDoAluno;
	}

}
