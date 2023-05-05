package br.com.alura.escola.gamificacao.dominio.selo;

import java.util.List;

import br.com.alura.escola.shared.dominio.Cpf;

public interface RepositorioDeSelos {

	void cadastra(Selo selo);

	Selo buscarPorNome(String nome);

	List<Selo> listarTodosOsSelos();

	List<Selo> selosDoAlunoComCpf(Cpf cpf);

}
