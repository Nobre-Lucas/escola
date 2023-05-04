package br.com.alura.escola.dominio.selo;

import java.util.List;

public interface RepositorioDeSelos {

	void cadastra(Selo selo);

	Selo buscarPorNome(String nome);

	List<Selo> listarTodosOsSelos();

}
