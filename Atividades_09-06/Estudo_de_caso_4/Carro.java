public class Carro extends Transporte
{
    private float combustivel;

    public Carro(int capacidade, float combustivel)
    {
        super(capacidade);
        this.combustivel = combustivel;
    }

    public void mostrarDetalhes()
    {
        System.out.println("Carro: ");
        super.mostrarDetalhes();
        System.out.println("Combustível: " + combustivel);
    }
}
