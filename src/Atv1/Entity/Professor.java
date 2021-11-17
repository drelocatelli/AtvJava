package Atv1.Entity;

public class Professor extends Funcionario {

	@Override
	public double calculaSalario() {
		return numHTrabalhadas * saldoH;
	}
}
