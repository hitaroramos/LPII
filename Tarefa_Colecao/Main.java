public class Main
{
	public static void main(String[] args)
	{
		Livro livro1 = new Livro("384558", "lafon", "records", "o Mar");
		Livro livro2 = new Livro("38422558", "Rafon", "Zecords", "o Ar");
		Livro livro3 = new Livro("384123312558", "Dafon", "Fecords", "o Lar");
		LivroService services = new LivroService();

		services.adicionar(livro1);
		services.adicionar(livro2);
		services.adicionar(livro3);

		services.listar();

		services.remove(livro1);

		services.listar();

		services.encontrar(livro3);

		services.obter(livro2);

		services.listar();

		services.quantidade();
		services.remove(livro2);
		services.remove(livro3);

		services.listar();
		System.out.println(services.quantidade());
	}
}
