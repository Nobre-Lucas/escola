package br.com.alura.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import br.com.alura.escola.shared.dominio.Cpf;
import br.com.alura.escola.shared.dominio.evento.PublicadorDeEventos;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		RepositorioDeAlunosEmMemoria repositorioDeAlunosEmMemoria = new RepositorioDeAlunosEmMemoria();
		PublicadorDeEventos publicadorDeEventos = new PublicadorDeEventos();
		publicadorDeEventos.adicionaOuvinte(new LogDeAlunoMatriculado());
		MatricularAluno useCase = new MatricularAluno(repositorioDeAlunosEmMemoria, publicadorDeEventos);
		MatricularAlunoDto dadosDoAluno = new MatricularAlunoDto("Fulano", "551.347.455-79", "fulano@gmail.com");

		useCase.executa(dadosDoAluno);

		Aluno buscarPorCPF = repositorioDeAlunosEmMemoria.buscarPorCPF(new Cpf("551.347.455-79"));
		assertEquals("Fulano", buscarPorCPF.getNome());
		assertEquals("55134745579", buscarPorCPF.getCpf().toString());
		assertEquals("fulano@gmail.com", buscarPorCPF.getEmail());
	}

}
