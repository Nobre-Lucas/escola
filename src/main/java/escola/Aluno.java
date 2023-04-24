package escola;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private Cpf cpf;
	private String nome;
	private Email email;
	private List<Telefone> telefones = new ArrayList<>();

	public Aluno(String cpf, String nome, String email) {
		this.cpf = new Cpf(cpf);
		this.nome = nome;
		this.email = new Email(email);
	}

	public void adicionaTelefone(String ddd, String numero) {
		this.telefones.add(new Telefone(ddd, numero));
	}

	public String getCpf() {
		return cpf.getCpfValue();
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email.getEderecoDeEmail();
	}

}
