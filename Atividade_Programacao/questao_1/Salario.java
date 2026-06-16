import java.util.Scanner;

public class Salario
{
    public static void main(String[] args) 
    {
        double salario,horas, salario_hora;
        salario_hora = 20.00;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite quantas horas você trabalha por mês:  ");
        horas = teclado.nextDouble();

        salario = horas * salario_hora;

        System.out.println("Salário: R$ " + salario);
    }
}
