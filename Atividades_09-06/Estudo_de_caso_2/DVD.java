package Estudo_de_caso_2;

public class DVD extends ItemBiblioteca
{
    private String duracao;

    public DVD(String titulo, String codigo, String duracao)
    {
        super(titulo, codigo);
        this.duracao = duracao;
    }

    public void exibirInformacoes()
    {
        System.out.println("DVD - Titulo: " + titulo + " Código: " + codigo + " Duração: " + duracao);
    }
}