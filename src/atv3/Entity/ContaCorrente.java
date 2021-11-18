package Entity;

public class ContaCorrente {

    protected int num;
    protected String cliente;
    protected double saldo = 0;

    public ContaCorrente(int num, String cliente) {
        this.num = num;
        this.cliente = cliente;
    }

    public void fazerDeposito(double quantidade) {
        saldo += quantidade;         
    }

    public double consultarSaldo() {
        return saldo;
    }

    public boolean realizarSaque(double quantidade) {

        if(quantidade <= saldo ) {
            saldo -= quantidade;
            return true;
        }
        
        return false;
    }
    
}
