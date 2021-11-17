package Atv2.Entity;

import java.lang.Math;

public class CalculadoraCientifica extends Calculadora {

	private static int count = 0;

	public CalculadoraCientifica() {
		count++;
	}

	public double raizQuadrada(double num) {
		return Math.sqrt(num);
	}

	public double potencia(double num1, double num2) {
		return Math.pow(num1, num2);
	}

	public int contadorObjetos() {
		return count;
	}

}
