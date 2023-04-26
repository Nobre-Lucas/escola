package br.com.alura.escola;

public class Email {

	private String enderecoDeEmail;

	public Email(String enderecoDeEmail) {
		if (enderecoDeEmail == null || !enderecoDeEmail.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"))
			throw new IllegalArgumentException("Email inválido");
		this.enderecoDeEmail = enderecoDeEmail;
	}

	public String getEderecoDeEmail() {
		return enderecoDeEmail;
	}

}
