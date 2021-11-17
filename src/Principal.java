import Entity.*;

public class Principal {

	public static void main(String[] args) {

		// Professor
		Professor professor = new Professor();
		professor.saldoH = 200;
		professor.numHTrabalhadas = 20;

		System.out.printf("Salário do professor: R$ %.2f \n", professor.calculaSalario());

		// Vendedor
		Vendedor vendedor = new Vendedor();
		vendedor.saldoH = 100;
		vendedor.numHTrabalhadas = 30;

		System.out.printf("Salário do vendedor: R$ %.2f", vendedor.calculaSalario());

	}

}
