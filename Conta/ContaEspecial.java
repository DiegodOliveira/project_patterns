package Conta;

public class ContaEspecial extends conta{
    double limite;

    @Override
    boolean saque(double valor) {
        return false;
    }

    public ContaEspecial(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }
}

