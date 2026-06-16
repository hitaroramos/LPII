import java.util.Scanner;

public class NumMaior
{
    public static void main (String[] args)
    {
        float num1, num2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = teclado.nextFloat();

        System.out.println("Digite outro número para comparar: ");
        num2 = teclado.nextFloat();

        if(num1 > num2)
        {
            System.out.println("O número maior é: " + num1);
        }
        if(num2 > num1)
        {
            System.out.println("O número maior é: " + num2);
        }
    }
}