package com.teste.pipeline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PipelineApplication {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.println("informe o cpf: ");
		String cpf = reader.readLine();

		System.out.println("O cpf digitado é: " +
				(ValidadorCpf.validarCpf(cpf) ? "Verdadeiro" : "falso"));

	}

}
