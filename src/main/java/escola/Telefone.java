package escola;

public class Telefone {

	private String ddd;
	private String numero;
	private String numeroCompleto;

	public Telefone(String ddd, String numero) {
		this.ddd = ddd.replaceAll("\\D", "");
		this.numero = numero.replaceAll("\\D", "");
		if (validaNumeroDeTelefone(ddd, numero))
			this.numeroCompleto = ddd + numero;
	}

	private boolean validaNumeroDeTelefone(String ddd, String numero) {
		String[] dddsValidos = { "11", "12", "13", "14", "15", "16", "17", "18", "19", "21", "22", "24", "27", "28",
				"31", "32", "33", "34", "35", "37", "38", "41", "42", "43", "44", "45", "46", "47", "48", "49", "51",
				"53", "54", "55", "61", "62", "63", "64", "65", "66", "67", "68", "69", "71", "73", "74", "75", "77",
				"79", "81", "82", "83", "84", "85", "86", "87", "88", "89", "91", "92", "93", "94", "95", "96", "97",
				"98", "99" };
		// todo: consertar validação de ddd abaixo
		for (String dddValido : dddsValidos) {
			System.out.println(dddValido);
			if (dddValido.equals(ddd)) {
				break;
			}
		}
		if (numero.length() != 9 || numero.length() != 8)
			throw new IllegalArgumentException(
					"Um número de telefone brasileiro deve ter entre 8 e 9 dígitos, exatamente");
		return true;
	}

	public String getDdd() {
		return ddd;
	}

	public String getNumero() {
		return numero;
	}

	public String getNumeroCompleto() {
		return numeroCompleto;
	}

}
