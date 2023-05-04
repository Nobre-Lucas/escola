package br.com.alura.escola.infra.selo;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.escola.dominio.selo.RepositorioDeSelos;
import br.com.alura.escola.dominio.selo.Selo;

public class RepositorioDeSelosEmMemoria implements RepositorioDeSelos {

	private List<Selo> cadastrados = new ArrayList<>();

	@Override
	public void cadastra(Selo selo) {
		this.cadastrados.add(selo);
	}

	@Override
	public Selo buscarPorNome(String nome) {
		return this.cadastrados.stream().filter(selo -> selo.getNome().toString().equals(nome)).findFirst()
				.orElseThrow(() -> new SeloNaoEncontradoException(nome));
	}

	@Override
	public List<Selo> listarTodosOsSelos() {
		return this.cadastrados;
	}

}
