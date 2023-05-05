package br.com.alura.escola;

import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import br.com.alura.escola.gamificacao.aplicacao.GeraSeloAlunoNovato;
import br.com.alura.escola.gamificacao.infra.selo.RepositorioDeSelosEmMemoria;
import br.com.alura.escola.shared.dominio.evento.PublicadorDeEventos;

public class MatricularAlunoViaLinhaDeComando {

	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "551.347.455-79";
		String email = "fulano@email.com";

		PublicadorDeEventos publicadorDeEventos = new PublicadorDeEventos();
		publicadorDeEventos.adicionaOuvinte(new LogDeAlunoMatriculado());
		publicadorDeEventos.adicionaOuvinte(new GeraSeloAlunoNovato(new RepositorioDeSelosEmMemoria()));

		MatricularAluno matricula = new MatricularAluno(new RepositorioDeAlunosEmMemoria(), publicadorDeEventos);
		matricula.executa(new MatricularAlunoDto(nome, cpf, email));
	}

}
