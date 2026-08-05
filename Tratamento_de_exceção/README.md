<h1> Respostas </h1>
<ul>
<h3> 
1.
<ul> 
<p align="justify"> 
A exceção na POO é o fator que gera uma falha no algoritmo. O tratamento de exceções implementa ao algoritmo uma maneira de contornar a falha.
</p>
</ul>
2.
<ul>
<p>   	
NullPointerException: Unchecked; <br>
IOException: checked; <br>
ArithmeticException: unchecked; <br>
FileNotFoundException: checked; <br>
ArrayIndexOutOfBoundsException: unchecked. 
</p>
</ul>
3.
<ul> 
<p align="justify"> 
O código tem como propósito testar as formas de tratar uma exceção, transformando uma exceção unchecked em checked. Começa apresentando uma lista de números e posteriormente pede para mostrar o número que está no indice 5 que não existe na lista, com isso dá essa falha ArrayIndexOutOfBoundsException que o próprio java reconhece. Ele checka a falha que o java reconheceu, personalizando a mensagem para: "Erro: índice fora do limite!"
</p>
</ul>
4. 
<ul>
<p>
Não será possível saber o que está tratando.<br>
Exemplo: 
<pre><code>
	public class TesteExcecao 
	{
		public static void main(String[] args) 
		{
			try 
			{
				int[] numeros = {1, 2, 3, 0.1 };
				System.out.println(numeros[3]);
			} catch (Exception e) {System.out.println("Erro.");}
		}
	}
</pre></code>
</p>
</ul>
</h3>
</ul>
