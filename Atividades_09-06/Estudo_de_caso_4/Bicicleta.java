public class Bicicleta extends Transporte
{
    private boolean temMarcha;

    public Bicicleta(int capacidade, boolean temMarcha)
    {
        super(capacidade);
        this.temMarcha = temMarcha;
    }    

    public void mostrarDetalhes()
    {
        System.out.println("Bicicleta: ");
        super.mostrarDetalhes();
        System.out.println("Têm Marcha: " + temMarcha);
    }
}
