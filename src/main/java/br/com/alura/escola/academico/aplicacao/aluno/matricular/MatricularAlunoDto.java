package br.com.alura.escola.academico.aplicacao.aluno.matricular;

import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.dominio.aluno.Email;
import br.com.alura.escola.shared.dominio.Cpf;

public class MatricularAlunoDto {

	private String nomeAluno;
	private String cpfAluno;
	private String emailAluno;

	public MatricularAlunoDto(String nomeAluno, String cpfAluno, String emailAluno) {
		super();
		this.nomeAluno = nomeAluno;
		this.cpfAluno = cpfAluno;
		this.emailAluno = emailAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public String getCpfAluno() {
		return cpfAluno;
	}

	public String getEmailAluno() {
		return emailAluno;
	}

	public Aluno criaAluno() {
		return new Aluno(new Cpf(cpfAluno), nomeAluno, new Email(emailAluno));
	}

}
