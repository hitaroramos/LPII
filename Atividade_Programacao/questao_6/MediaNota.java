import java.util.Scanner;

public class MediaNota
{
    public static void main(String[] args)
    {
        float nota1, nota2, trab, media;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a 1º nota: ");
        nota1 = teclado.nextFloat();

        System.out.println("Digite a 2º nota: ");
        nota2 = teclado.nextFloat();

        System.out.println("Digite a nota do trabalho: ");
        trab = teclado.nextFloat();

        media = (nota1 + nota2 + trab)/3; 

        if(media >= 7)
        {
            System.out.println("Aprovado.");
        }
        else
        {
            System.out.println("Reprovado.");
        }
    }
}