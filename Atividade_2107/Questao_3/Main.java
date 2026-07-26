package Questao_3;
public class Main
{
	public static void main(String[] args)
	{
		Coordenador c1 = new Coordenador("Jonas", 1, 5000, 500);
		c1.calcularsalario();

		Professor p1 = new Professor("Souza", 2,3400, 2, 2);
		p1.calcularsalario();

		Tecnico t1 = new Tecnico("Fernanda", 3, 2500, 1000);
		t1.calcularsalario();
	}
}