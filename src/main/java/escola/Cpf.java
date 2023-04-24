package escola;

public class Cpf {

	private String cpfValidado;

	public Cpf(String cpfNaoValidado) {

		String cpfEmValidacao = cpfNaoValidado;
		cpfEmValidacao = cpfEmValidacao.replace(".", "").replace("-", "");
		if (validaCpf(cpfEmValidacao))
			this.cpfValidado = cpfNaoValidado;
	}

	public String getCpfValue() {
		return cpfValidado;
	}

	private boolean validaCpf(String cpf) {
		int soma, resto, digito1, digito2;

		soma = 0;
		for (int i = 0; i < 9; i++) {
			soma += (cpf.charAt(i) - '0') * (10 - i);
		}
		resto = soma % 11;
		digito1 = resto < 2 ? 0 : 11 - resto;

		soma = 0;
		for (int i = 0; i < 10; i++) {
			soma += (cpf.charAt(i) - '0') * (11 - i);
		}
		resto = soma % 11;
		digito2 = resto < 2 ? 0 : 11 - resto;

		if (cpf.length() != 11) {
			throw new IllegalArgumentException("Um CPF deve ter ao menos 11 dígitos");
		} else if (cpf.matches("(\\d)\\1{10}")) {
			throw new IllegalArgumentException("Um CPF não deve ter todos os dígitos iguais");
		} else if (cpf.charAt(9) - '0' != digito1) {
			throw new IllegalArgumentException("Primeiro digito verificador não bate com a regra");
		} else if (cpf.charAt(10) - '0' != digito2) {
			throw new IllegalArgumentException("Segundo digito verificador não bate com a regra");
		}

		return true;
	}

}
