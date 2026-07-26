package Questao_4;

public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("-----------------");
        
        ContaCorrente cc1 = new ContaCorrente(11, "jorge", 0 );

        cc1.consultarSaldo();
        
        cc1.depositar(10);
        
        cc1.consultarSaldo();

        cc1.sacar(11);

        cc1.consultarSaldo();

        System.out.println("-----------------");

        ContaInvestimento ci1 = new ContaInvestimento(11, "jules", 1200);

        ci1.consultarSaldo();
        
        ci1.depositar(10);
        
        ci1.consultarSaldo();

        ci1.sacar(10);

        ci1.consultarSaldo();

        ci1.renderJuros();

        ci1.consultarSaldo();

        System.out.println("-----------------");

        ContaPoupanca cp1 = new ContaPoupanca(11, "josh", 1200);

        cp1.consultarSaldo();
        
        cp1.depositar(10);
        
        cp1.consultarSaldo();

        cp1.sacar(10);

        cp1.consultarSaldo();
    }
}
