import java.util.Scanner;

public class IMC
{
    public static void main(String[] args)
    {
        double peso, altura, imc;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o peso: ");
        peso = teclado.nextDouble();

        System.out.println("Digite a altura: ");
        altura = teclado.nextDouble();

        double quadrado = Math.pow(altura, 2);

        imc = peso/quadrado;

        if(imc <= 30)
        {
            System.out.println("IMC abaixo ou igual a 30.");
        }
        else
        {
            System.out.println("Obeso.");
        }
    }
}