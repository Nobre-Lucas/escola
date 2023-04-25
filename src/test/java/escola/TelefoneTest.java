package escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelefoneTest {

	@Test
	void naoDeveCriarTelefoneComDadosInvalidos() {
		assertThrows(IllegalArgumentException.class, () -> new Telefone("01", "99999-9999"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("91", "99999-99999"));
	}

	@Test
	void DeveCriarTelefoneComDadosValidos() {
		Telefone telefone = new Telefone("91", "99999-9999");
		assertEquals(telefone.getDdd(), "91");
		assertEquals(telefone.getNumero(), "999999999");
	}

}
