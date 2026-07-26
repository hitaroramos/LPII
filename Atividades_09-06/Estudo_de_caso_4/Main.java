public class Main 
{
    public static void main(String[] args) 
    {
        Transporte bicicleta = new Bicicleta(1, false);

        bicicleta.mostrarDetalhes();

        Transporte carro = new Carro(4, 30);

        carro.mostrarDetalhes();

        Transporte onibus = new Onibus(15, "L56");

        onibus.mostrarDetalhes();
    }
}
