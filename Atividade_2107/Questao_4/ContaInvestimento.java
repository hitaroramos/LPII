package Questao_4;

public class ContaInvestimento extends Conta implements Operacoes
{
    public ContaInvestimento(int cNumero, String cTitular, float cSaldo)
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

    public void renderJuros()
    {
        this.saldo = (float) (this.saldo + (this.saldo * 0.01)); 
    }
}