package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.dominio.aluno.exceptions.NumeroMaximoDeTelefonesException;

class AlunoTest {

	@Test
	void alunoNaoDeveTerMaisTelefonesQueOPermitidoPelasRegrasDeNegocio() {
		MatricularAlunoDto matriculador = new MatricularAlunoDto("Fulano", "551.347.455-79", "fulano@gmail.com");
		Aluno aluno = matriculador.criaAluno();
		for (int i = 0; i < aluno.getNumeroMaximoDeTelefones(); i++) {
			aluno.adicionaTelefone("91", "99999-9999");
		}
		assertThrows(NumeroMaximoDeTelefonesException.class, () -> aluno.adicionaTelefone("91", "99999-9999"));
	}

}
