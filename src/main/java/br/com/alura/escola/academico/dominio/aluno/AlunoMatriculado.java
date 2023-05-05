package br.com.alura.escola.academico.dominio.aluno;

import java.time.LocalDateTime;
import java.util.Map;

import br.com.alura.escola.shared.dominio.Cpf;
import br.com.alura.escola.shared.dominio.evento.Evento;
import br.com.alura.escola.shared.dominio.evento.TipoDeEvento;

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

	@Override
	public TipoDeEvento tipoDoEvento() {
		return TipoDeEvento.ALUNO_MATRICULADO;
	}

	@Override
	public Map<String, Object> informacoesDoEvento() {
		return Map.of("cpf", cpfDoAluno);
	}

}
