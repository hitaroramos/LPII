package Questao_4;

public class ContaCorrente extends Conta implements Operacoes
{
    public ContaCorrente(int cNumero, String cTitular, float cSaldo)
    {
        super(cNumero, cTitular, cSaldo);      
    }
    
    public void depositar(float valor)
    {
        this.saldo = this.saldo + valor;
    }
    
    public void sacar(float valor)
    {
        if (this.saldo >= valor)
        {
            this.saldo = this.saldo - valor;
        }
        else
        {
            System.out.println("Saldo insuficiente para saque...");
        }
    }
}
