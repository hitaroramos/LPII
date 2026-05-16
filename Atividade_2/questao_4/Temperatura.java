import java.util.Scanner;

public class Temperatura
{
    public static void main(String[] args)
    {
        float temp;
        Scanner teclado = new Scanner(System.in);
    
        System.out.println("Digite a temperatura em Celsius do paciente: ");
        temp = teclado.nextFloat();

        if(temp > 37)
        {
            System.out.println("O paciente está com febre.");
        }
        else
        {
            System.out.println("O paciente está com a temperatura corporal normal.");
        }
    }
}