package br.com.alura.escola.gamificacao.aplicacao;

import br.com.alura.escola.gamificacao.dominio.selo.RepositorioDeSelos;
import br.com.alura.escola.gamificacao.dominio.selo.Selo;
import br.com.alura.escola.shared.dominio.Cpf;
import br.com.alura.escola.shared.dominio.evento.Evento;
import br.com.alura.escola.shared.dominio.evento.Ouvinte;
import br.com.alura.escola.shared.dominio.evento.TipoDeEvento;

public class GeraSeloAlunoNovato extends Ouvinte {

	private final RepositorioDeSelos repositorioDeSelos;

	public GeraSeloAlunoNovato(RepositorioDeSelos repositorioDeSelos) {
		this.repositorioDeSelos = repositorioDeSelos;
	}

	@Override
	protected void reageAo(Evento evento) {
		Cpf cpfDoAluno = (Cpf) evento.informacoesDoEvento().get("cpf");
		Selo novato = new Selo(cpfDoAluno, "Novato");
		repositorioDeSelos.cadastra(novato);
	}

	@Override
	protected boolean deveProcessar(Evento evento) {
		return evento.tipoDoEvento() == TipoDeEvento.ALUNO_MATRICULADO;
	}

}
