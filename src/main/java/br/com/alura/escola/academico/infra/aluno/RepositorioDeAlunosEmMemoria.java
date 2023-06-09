package br.com.alura.escola.academico.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.academico.dominio.aluno.exceptions.AlunoNaoEncontradoException;
import br.com.alura.escola.shared.dominio.Cpf;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

	private List<Aluno> matriculados = new ArrayList<>();

	@Override
	public void matricula(Aluno aluno) {
		this.matriculados.add(aluno);
	}

	@Override
	public Aluno buscarPorCPF(Cpf cpf) {
		return this.matriculados.stream().filter(a -> a.getCpf().toString().equals(cpf.toString())).findFirst()
				.orElseThrow(() -> new AlunoNaoEncontradoException(cpf));
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		return this.matriculados;
	}

}
