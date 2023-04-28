package br.com.alura.escola.infra.aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.Cpf;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.dominio.aluno.Telefone;

public class RepositorioDeAlunosComJDBC implements RepositorioDeAlunos {

	private final Connection connection;

	public RepositorioDeAlunosComJDBC(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void matricula(Aluno aluno) {
		String sqlQuery = "INSERT INTO ALUNO VALUES(?, ?, ?)";
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sqlQuery);
			prepareStatement.setString(1, aluno.getCpf());
			prepareStatement.setString(2, aluno.getNome());
			prepareStatement.setString(3, aluno.getEmail());
			prepareStatement.execute();

			sqlQuery = "INSERT INTO TELEFONE VALUES(?, ?)";
			prepareStatement = connection.prepareStatement(sqlQuery);
			for (Telefone telefone : aluno.getTelefones()) {
				prepareStatement.setString(1, telefone.getDdd());
				prepareStatement.setString(2, telefone.getNumero());
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Aluno buscarPorCPF(Cpf cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		// TODO Auto-generated method stub
		return null;
	}

}
