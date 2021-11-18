package Entity;

public class ContaCorrenteEspecial extends ContaCorrente {

    private double limite = 10000;

    public ContaCorrenteEspecial(int num, String cliente) {
        super(num, cliente);
    }

    public boolean realizarSaque(double quantidade) {

        if(quantidade <= limite ) {
            saldo -= quantidade;
            return true;
        }
        
        return false;
    }
    
}
