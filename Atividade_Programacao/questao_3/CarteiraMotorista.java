import java.util.Scanner;

public class CarteiraMotorista
{
    public static void main(String[] args)
    {
        int idade;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = teclado.nextInt();

        if(idade > 18)
        {
            System.out.println("Você pode tirar a carteira de motorista.");
        } 
        else
        {
            System.out.println("Você não pode tirar a carteira de motorista.");
        }       
    }
}