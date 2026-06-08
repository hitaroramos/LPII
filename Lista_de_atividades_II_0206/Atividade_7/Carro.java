public class Carro extends Veiculo
{
    private int rodas;

    public Carro(String modelo, String marca, String chassi, int rodas)
    {
        super(modelo, marca, chassi);
        this.rodas = rodas;
    }

    @Override
    public String getInformacoes()
    {
        return super.getInformacoes() + "Rodas: " + rodas;
    }
}