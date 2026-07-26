package Questao_4;

public abstract class Conta
{
    protected int numero;
    protected String titular;
    protected float saldo;
    
    public Conta(int cNumero, String cTitular, float cSaldo)
    {
        this.numero = cNumero;
        this.titular = cTitular;
        this.saldo = cSaldo;
    }

    public void consultarSaldo() 
    {
        System.out.println("(" + this.titular +") Saldo atual: " + this.saldo);
    }
}
