import Entity.ContaCorrente;
import Entity.ContaCorrenteEspecial;

public class Principal {
    public static void main(String[] args) throws Exception {

        // conta corrente
        
        ContaCorrente contaCorrente = new ContaCorrente(1, "Andressa");
        contaCorrente.fazerDeposito(2500);
        System.out.printf("Saldo: %.2f \n",contaCorrente.consultarSaldo());
        boolean saque = contaCorrente.realizarSaque(500);
        System.out.printf("Saque realizado: %b \n", saque);
        System.out.printf("Novo saldo: %.2f \n",contaCorrente.consultarSaldo());

        System.out.println();
        
        // conta corrente especial

        ContaCorrenteEspecial contaCorrenteEspecial = new ContaCorrenteEspecial(2, "Ana");
        contaCorrenteEspecial.fazerDeposito(5000);
        System.out.printf("Saldo: %.2f \n", contaCorrenteEspecial.consultarSaldo());
        boolean saquecontaCorrenteEspecial = contaCorrenteEspecial.realizarSaque(8000);
        System.out.printf("Saque realizado: %b \n", saquecontaCorrenteEspecial);
        System.out.printf("Saldo: %.2f \n",contaCorrenteEspecial.consultarSaldo());
        System.out.printf("Seu saldo está: %s", (contaCorrenteEspecial.consultarSaldo() >= 0) ? "Positivo" : "Negativo");

        
    }
}
