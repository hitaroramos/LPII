package Estudo_de_caso_2;

public class Livro extends ItemBiblioteca
{
    private String autor;
    private int numeroPaginas;    

    public Livro(String titulo, String codigo, String autor, int numeroPaginas)
    {
        super(titulo, codigo);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void exibirInformacoes()
    {
        System.out.println("Livro - Titulo: " + titulo + " Código: " + codigo + 
        " Autor: " + autor + " Número de Páginas: " + numeroPaginas);
    }
}
