package Estudo_de_caso_2;

public class Main 
{
    public static void main(String[] args)
    {
        ItemBiblioteca livro = new Livro("Harry Potter", "1", "J. K. Rowling", 264);

        livro.exibirInformacoes();

        ItemBiblioteca revista = new Revista("VEJA", "2", "10º");

        revista.exibirInformacoes();

        ItemBiblioteca dvd = new DVD("pablo do arrocha", "3", "2:30min");

        dvd.exibirInformacoes();
    }
}
