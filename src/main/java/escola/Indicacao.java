package escola;

import java.time.LocalDateTime;

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
