import java.util.Scanner;

public class GastoDistancia
{
    public static void main(String[] args)
    {
        float custo, distancia, preco_litro, quant_gasolina;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o preço do litro de gasolina: ");
        preco_litro = teclado.nextFloat();

        System.out.println("Digite a distancia em km: ");
        distancia = teclado.nextFloat();

        quant_gasolina = distancia/12;
        custo = preco_litro * quant_gasolina;

        System.out.println("Quantidade de gasolina: " + quant_gasolina + " e custo: " + custo);

    }

}