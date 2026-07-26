package Estudo_de_caso_2;

public class ItemBiblioteca 
{
    protected String titulo, codigo;
    
    public ItemBiblioteca(String titulo, String codigo)
    {
        this.titulo = titulo;
        this.codigo = codigo;
    }

    public void exibirInformacoes()
    {
        System.out.println("Item da biblioteca - Titulo: " + titulo + " Código: " + codigo);
    }
}
