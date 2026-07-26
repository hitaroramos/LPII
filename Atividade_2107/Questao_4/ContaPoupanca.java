package Questao_4;

public class ContaPoupanca extends Conta implements Operacoes
{
    public ContaPoupanca(int cNumero, String cTitular, float cSaldo)
    {
        super(cNumero, cTitular, cSaldo);      
    }

    public void depositar(float valor)
    {
        this.saldo = this.saldo + valor;
    }
    
    public void sacar(float valor)
    {
        this.saldo = this.saldo - valor;
    }    
}