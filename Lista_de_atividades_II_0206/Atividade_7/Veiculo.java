public class Veiculo
{
    private String modelo;
    private String marca;
    private String chassi;

    public Veiculo(String modelo, String marca, String chassi)
    {
        this.modelo = modelo;
        this.marca = marca;
        this.chassi = chassi;
    }

    public String getInformacoes() 
    {
        return "Modelo: " + modelo + ", Marca: " + marca + ", Chassi: " + chassi;
    }
}