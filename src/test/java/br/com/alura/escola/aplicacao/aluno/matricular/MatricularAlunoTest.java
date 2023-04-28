package br.com.alura.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.Cpf;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		RepositorioDeAlunosEmMemoria repositorioDeAlunosEmMemoria = new RepositorioDeAlunosEmMemoria();
		MatricularAluno useCase = new MatricularAluno(repositorioDeAlunosEmMemoria);
		MatricularAlunoDto dadosDoAluno = new MatricularAlunoDto("Fulano", "551.347.455-79", "fulano@gmail.com");

		useCase.executa(dadosDoAluno);

		Aluno buscarPorCPF = repositorioDeAlunosEmMemoria.buscarPorCPF(new Cpf("551.347.455-79"));
		assertEquals("Fulano", buscarPorCPF.getNome());
		assertEquals("55134745579", buscarPorCPF.getCpf());
		assertEquals("fulano@gmail.com", buscarPorCPF.getEmail());
	}

}
