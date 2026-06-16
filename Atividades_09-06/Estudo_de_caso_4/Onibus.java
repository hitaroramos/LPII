public class Onibus extends Transporte
{
    private String linha;
    
    public Onibus(int capacidade, String linha)
    {
        super(capacidade);
        this.linha = linha;
    }

    public void mostrarDetalhes()
    {
        System.out.println("Onibus: ");
        super.mostrarDetalhes();
        System.out.println("Linha: " + linha);
    }
}
