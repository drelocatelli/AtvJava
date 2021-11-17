package Atv1.Entity;

public abstract class Funcionario {

	// numero de horas trabalhadas
	public int numHTrabalhadas;
	// valor que funcionario recebe por horas
	public double saldoH;

	public abstract double calculaSalario();

}
