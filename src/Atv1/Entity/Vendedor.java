package Atv1.Entity;

public class Vendedor extends Funcionario {

	// valor da comissao
	public double valorComissao;

	@Override
	public double calculaSalario() {
		return numHTrabalhadas * saldoH + valorComissao;
	}
}
