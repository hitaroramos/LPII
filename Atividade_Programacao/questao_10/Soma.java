import java.util.Scanner;

public class Soma
{
    public static void main(String[] args)
    {
        float num1, num2, soma;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = teclado.nextFloat();

        System.out.println("Digite outro número: ");
        num2 = teclado.nextFloat();

        soma = num1 + num2;

        if(soma > 10)
        {
            System.out.println("Resultado: " + soma);
        }
    }
}
