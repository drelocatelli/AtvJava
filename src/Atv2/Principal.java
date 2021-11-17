package Atv2;

import Atv2.Entity.CalculadoraCientifica;

public class Principal {

	public static void main(String[] args) {

		CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();

		// Calcula quantidade de objetos intanciados
		System.out.printf("Qtd objetos: %d \n", calculadoraCientifica.contadorObjetos());

		// Soma
		System.out.printf("Soma: %.1f \n", calculadoraCientifica.soma(2, 3));

		// Subtração
		System.out.printf("Subtração: %.1f \n", calculadoraCientifica.subtracao(2, 3));

		// Multiplicação
		System.out.printf("Multiplicação: %.1f \n", calculadoraCientifica.multiplicacao(2, 3));

		// Divisão
		System.out.printf("Divisão: %.1f \n", calculadoraCientifica.divisao(2, 3));

		// Potencia
		System.out.printf("Potência: %.1f \n", calculadoraCientifica.potencia(2, 3));

		// Raiz quadrada
		System.out.printf("Raiz quadrada: %.1f", calculadoraCientifica.raizQuadrada(4));

	}

}
