import java.util.Scanner;

public class SomasSub
{
    public static void main(String[] args)
    {
        float num1, num2, soma, maior10, menor10;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = teclado.nextFloat();

        System.out.println("Digite outro número: ");
        num2 = teclado.nextFloat();

        soma = num1 + num2;

        if(soma >= 10)
        {
            maior10 = soma + 5;
            System.out.println("Resultado: " + maior10);   
        }
        else
        {
            menor10 = soma - 7;
            System.out.println("Resultado: " + menor10);   
        }
    }
}