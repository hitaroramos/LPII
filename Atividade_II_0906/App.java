public class App 
{
    public static void main(String[] args) 
    {

        Banco banco = new Banco("Raiam", null, "Jorge",   null, "Jonas", null);

        System.out.println("Saldo de Raiam: " + banco.getSaldo("Raiam"));
        System.out.println("Raiam depositou R$50,00 que a vó deu.");
        banco.creditar("Raiam", 50.0);
        System.out.println("Saldo de Raiam: " + banco.getSaldo("Raiam"));
        System.out.println("Raiam comprou um hamburguer do mcdonald: R$30,00");
        banco.debitar("Raiam", 30.0);
        System.out.println("Saldo de Raiam: " + banco.getSaldo("Raiam"));

        System.out.println("-------------");

        System.out.println("Saldo de Jorge: " + banco.getSaldo("Jorge"));
        System.out.println("Jorge ganhou a diária R$80,00 e depositou.");
        banco.creditar("Jorge", 80.0);
        System.out.println("Saldo de Jorge: " + banco.getSaldo("Jorge"));

        System.out.println("-------------");

        System.out.println("Saldo de Jonas: " + banco.getSaldo("Jonas"));
        System.out.println("Jonas achou na rua R$10,00 e depositou.");
        banco.creditar("Jonas", 10.0);
        System.out.println("Saldo de Jonas: " + banco.getSaldo("Jonas"));

        System.out.println("-------------");

        System.out.println("Jorge tava devendo Jonas R$40,00 então transferiu.");
        banco.transferir("Jorge", "Jonas", 40.0);

        System.out.println("Saldo de Jonas: " + banco.getSaldo("Jonas"));

    }
}
