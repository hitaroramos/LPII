import java.util.Scanner;

public class SalarioProfessores
{
    public static void main(String[] args)
    {
        float salario_bruto, salario_liquido, desconto, valor_hora, hora_mes;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o preço da hora aula: ");
        valor_hora = teclado.nextFloat();

        System.out.println("Digite quantas horas trabalhas por mês: ");
        hora_mes = teclado.nextFloat();

        System.out.println("Digite o percentual de desconto do INSS: ");
        desconto = teclado.nextFloat();

        salario_bruto = valor_hora * hora_mes;
        salario_liquido = (desconto/100) * salario_bruto;

        System.out.println("Salário Líquido: " + salario_liquido);
    } 
}