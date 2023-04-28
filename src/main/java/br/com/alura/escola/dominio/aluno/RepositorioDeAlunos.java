package br.com.alura.escola.dominio.aluno;

import java.util.List;

public interface RepositorioDeAlunos {

	void matricula(Aluno aluno);

	Aluno buscarPorCPF(Cpf cpf);

	List<Aluno> listarTodosAlunosMatriculados();

}
