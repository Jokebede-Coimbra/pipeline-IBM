package com.teste.pipeline;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PipelineApplicationTests {

	@Test
	void cpfValido() {
		var valido = ValidadorCpf.validarCpf("615.284.680-31");
		assertEquals(true, valido);
	}

	@Test
	void cpfInvalido() {
		var invalido = ValidadorCpf.validarCpf("88888888888");
		assertEquals(true, invalido);
	}

}
