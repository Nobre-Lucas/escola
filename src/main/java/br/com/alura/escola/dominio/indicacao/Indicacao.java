package br.com.alura.escola.dominio.indicacao;

import java.time.LocalDateTime;

import br.com.alura.escola.dominio.aluno.Aluno;

public class Indicacao {

	private Aluno indicante;
	private Aluno indicado;
	private LocalDateTime dataDaIndicacao;

	public Indicacao(Aluno indicante, Aluno indicado) {
		this.indicante = indicante;
		this.indicado = indicado;
		this.dataDaIndicacao = LocalDateTime.now();
	}

	public Aluno getIndicante() {
		return indicante;
	}

	public Aluno getIndicado() {
		return indicado;
	}

	public LocalDateTime getDataDaIndicacao() {
		return dataDaIndicacao;
	}

}
