package br.com.alura.escola;

import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.dominio.PublicadorDeEventos;
import br.com.alura.escola.dominio.aluno.LogDeAlunoMatriculado;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoViaLinhaDeComando {

	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "551.347.455-79";
		String email = "fulano@email.com";

		PublicadorDeEventos publicadorDeEventos = new PublicadorDeEventos();
		publicadorDeEventos.adicionaOuvinte(new LogDeAlunoMatriculado());

		MatricularAluno matricula = new MatricularAluno(new RepositorioDeAlunosEmMemoria(), publicadorDeEventos);
		matricula.executa(new MatricularAlunoDto(nome, cpf, email));
	}

}
