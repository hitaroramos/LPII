import java.util.Scanner;

public class AreaCirc
{
    public static void main(String[] args)
    {
        double pi, area, raio;
        pi = 3.14;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o raio da circunferência: ");
        raio = teclado.nextDouble();

        double quadrado = Math.pow(raio, 2);

        area = pi * quadrado;

        System.out.println("Area da circunferência: " + area);  
    }
}