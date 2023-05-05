package br.com.aluno.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.shared.dominio.Cpf;

class CpfTest {

	@Test
	void naoDeveCriarCpfInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new Cpf("999.999.999-99"));
		assertThrows(IllegalArgumentException.class, () -> new Cpf("999.999.999-999"));
	}

	@Test
	void deveCriarCpfValido() {
		Cpf cpf = new Cpf("327.527.275-69");
		assertEquals(cpf.toString(), "32752727569");
	}

}
