package Test;

import org.junit.Assert;

import org.junit.Test;

import com.db1.ContaCorrente.infra.Verificadora;

public class VerificadoraTest {
	
	@Test
	public void deveRetornarExce��oQuandoValorNulo() {
		String mensagem = null;
		try {
		Verificadora.verificaStringValida(null, "valor n�o pode ser nulo");
		}catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("valor n�o pode ser nulo", mensagem);
	}

	@Test
	public void deveRetornarExce��oQuandoValorVazio() {
		String mensagem = null;
		try {
		Verificadora.verificaStringValida("   ", "valor n�o pode ser vazio");
		}catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("valor n�o pode ser vazio", mensagem);
	}
	@Test
	public void naoDeveRetornarExce��oQuandoValorValido() {
		String mensagem = null;
		try {
		Verificadora.verificaStringValida("DB1 START", "valor Inv�lido");
		}catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		Assert.assertNull(mensagem);
	}

}
