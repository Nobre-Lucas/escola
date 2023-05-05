package br.com.alura.escola.academico.aplicacao.aluno.matricular;

import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.dominio.aluno.AlunoMatriculado;
import br.com.alura.escola.academico.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.shared.dominio.evento.PublicadorDeEventos;

public class MatricularAluno {

	private final RepositorioDeAlunos repositorioDeAlunos;
	private final PublicadorDeEventos publicadorDeEventos;

	public MatricularAluno(RepositorioDeAlunos repositorioDeAlunos, PublicadorDeEventos publicadorDeEventos) {
		this.repositorioDeAlunos = repositorioDeAlunos;
		this.publicadorDeEventos = publicadorDeEventos;
	}

	public void executa(MatricularAlunoDto dadosDoAluno) {
		Aluno novoAluno = dadosDoAluno.criaAluno();
		repositorioDeAlunos.matricula(novoAluno);

		AlunoMatriculado evento = new AlunoMatriculado(novoAluno.getCpf());
		publicadorDeEventos.publicaEvento(evento);
	}

}
