package br.com.alura.escola.shared.dominio.evento;

import java.util.ArrayList;
import java.util.List;

public class PublicadorDeEventos {

	private List<Ouvinte> ouvintes = new ArrayList<>();

	public void adicionaOuvinte(Ouvinte ouvinte) {
		this.ouvintes.add(ouvinte);
	}

	public void publicaEvento(Evento evento) {
		this.ouvintes.forEach(ouvinte -> {
			ouvinte.processa(evento);
		});
	}

}
