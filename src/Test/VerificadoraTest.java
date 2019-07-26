package Test;

import org.junit.Assert;

import org.junit.Test;

import com.db1.ContaCorrente.infra.Verificadora;

public class VerificadoraTest {
	
	@Test
	public void deveRetornarExceçãoQuandoValorNulo() {
		String mensagem = null;
		try {
		Verificadora.verificaStringValida(null, "valor não pode ser nulo");
		}catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("valor não pode ser nulo", mensagem);
	}

	@Test
	public void deveRetornarExceçãoQuandoValorVazio() {
		String mensagem = null;
		try {
		Verificadora.verificaStringValida("   ", "valor não pode ser vazio");
		}catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("valor não pode ser vazio", mensagem);
	}
	@Test
	public void naoDeveRetornarExceçãoQuandoValorValido() {
		String mensagem = null;
		try {
		Verificadora.verificaStringValida("DB1 START", "valor Inválido");
		}catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		Assert.assertNull(mensagem);
	}

}
