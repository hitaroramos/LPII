package Estudo_de_caso_2;

public class Revista extends ItemBiblioteca
{
    private String edicao;

    public Revista(String titulo, String codigo, String edicao)
    {
        super(titulo, codigo);
        this.edicao = edicao;
    }

    public void exibirInformacoes()
    {
        System.out.println("Revista - Titulo: " + titulo + " Código: " + codigo + " Edição: " + edicao);
    }
}