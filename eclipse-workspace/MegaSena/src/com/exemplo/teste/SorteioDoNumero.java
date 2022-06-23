package com.exemplo.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.exemplo.megasena.MegaSenaUtilitario;

class SorteioDoNumero {
	// implementar os testes
	@Test
	void geracaoDeNumeroPositivo() {
		int numeroMaiorQueZero = MegaSenaUtilitario.sortearNumero();
		// usando a instrucao assertion
		assertTrue(numeroMaiorQueZero > 0);
	}

	@Test
	void geracaoDeNumeroMenorOuIgualASessenta() {
		int numeroMenorIgualSessenta = MegaSenaUtilitario.sortearNumero();
		// usando a instrucao assertion
		assertTrue(numeroMenorIgualSessenta <= 60);

	}

}

/*
 * @Test void test() { fail("Not yet implemented"); }
 * 
 * }
 */
