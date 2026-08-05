import java.util.Scanner;

public class CalculadoraSeguro
{
	Scanner teclado = new Scanner(System.in);
	
	int idadeCondutor;
	double valorVeiculo;
	
	public void calcular()
	{
		System.out.print("Digite a idade do condutor: ");
		idadeCondutor = teclado.nextInt();
				
		try
		{
			if(idadeCondutor < 18){ throw new IdadeInvalidaException("Idade do condutor inválida!"); }
		} catch (IdadeInvalidaException e){ System.out.println("Erro: " + e.getMessage()); } 
		
		System.out.print("");		
		System.out.print("Digite o valor do veiculo: ");
		valorVeiculo = teclado.nextDouble();
		
		try
		{
			if(valorVeiculo == 0 || valorVeiculo < 0){ throw new IllegalArgumentException("Valor invalido"); }
		} catch (IllegalArgumentException e) { System.out.println("Erro: " + e.getMessage()); } finally{ System.out.println("Processo encerrado"); }
		
		double seguro;
		if(idadeCondutor < 25)
		{
			seguro = (valorVeiculo * 0.07);
		}		
		else
		{
			seguro = (valorVeiculo * 0.05);
		}
		
		System.out.println("");
		System.out.print("O valor do seguro é: " + seguro);
		
	}	
	
}
