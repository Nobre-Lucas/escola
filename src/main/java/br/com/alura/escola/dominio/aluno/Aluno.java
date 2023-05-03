package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.escola.dominio.aluno.exceptions.NumeroMaximoDeTelefonesException;
import br.com.alura.escola.infra.aluno.CifradorDeSenhaComMD5;

public class Aluno {

	private Cpf cpf;
	private String nome;
	private Email email;
	private List<Telefone> telefones = new ArrayList<>();
	private String senha;

	private int numeroMaximoDeTelefones = 2;

	public Aluno(Cpf cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	public void adicionaTelefone(String ddd, String numero) {
		if (this.telefones.size() == this.numeroMaximoDeTelefones) {
			throw new NumeroMaximoDeTelefonesException(this.numeroMaximoDeTelefones);
		}
		this.telefones.add(new Telefone(ddd, numero));
	}

	public Cpf getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email.getEderecoDeEmail();
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setSenha(String senha) {
		CifradorDeSenha cifrador = new CifradorDeSenhaComMD5();
		this.senha = cifrador.cifrarSenha(senha);
	}

	public String getSenha() {
		return senha;
	}

	public int getNumeroMaximoDeTelefones() {
		return this.numeroMaximoDeTelefones;
	}

}
