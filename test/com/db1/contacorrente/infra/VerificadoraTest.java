package com.db1.contacorrente.infra;

import org.junit.Assert;
import org.junit.Test;

public class VerificadoraTest {
	
	@Test
	public void deveRetornarExceptionQuandoValorNull() {
		String mensagem = null;
		try {
			Verificadora.verificaStringValida(null, "Valor n�o pode ser nulo");
		} catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("Valor n�o pode ser nulo", mensagem);
	}
	
	@Test
	public void deveRetornarExceptionQuandoValorVazio() {
		String mensagem = null;
		try {
			Verificadora.verificaStringValida("   ", "Valor n�o pode ser vazio");
		} catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("Valor n�o pode ser vazio", mensagem);	
	}
	
	@Test
	public void naoDeveRetornarExceptionQuandoValorValido() {
		String mensagem = null;
		try {
			Verificadora.verificaStringValida("DB1 Start", "Valor n�o pode ser vazio");
		} catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		Assert.assertNull(mensagem);
	}
	@Test
	public void deveRetornarExceptionQuandoValorMenorQueZero() {
		String mensagem = null;
		try {
			Verificadora.valorMaiorQueZero(-15.0 , "Valor n�o pode ser menor que zero");
		} catch(RuntimeException e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("Valor n�o pode ser menor que zero", mensagem);
	}
}

