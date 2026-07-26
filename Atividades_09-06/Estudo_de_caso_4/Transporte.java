public class Transporte
{
    protected int capacidade;

    public Transporte(int capacidade)
    {
        this.capacidade = capacidade;
    }

    public void mostrarDetalhes()
    {
        System.out.println("Capacidade: " + capacidade);
    }
}