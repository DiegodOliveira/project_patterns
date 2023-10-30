package Conta;

public class ContaInvestimento extends conta{

    int prazo;
    double taxa;

    boolean saque(double valor){
        if(this.saldo > valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    boolean deposito(double valor){
        return false;
    }

    double aplicaRendimento(double taxa){
        return taxa;
    }

    public ContaInvestimento(int numero, double saldo){
        super(numero, saldo);
        this.taxa = taxa;
        this.prazo = prazo;
    }
}
