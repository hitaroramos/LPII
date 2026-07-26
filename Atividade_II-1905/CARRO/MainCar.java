package CARRO;

public class MainCar 
{
    public static void main(String[] args) 
    {
        System.out.println("Especificações Carro");
        Carro carrin = new Carro("Supra", 0, 0, 0 ); 
        
        carrin.partida(true);
        carrin.trocaMarcha(true);
        carrin.acelerar(true);
        carrin.direcao(true);
    }

    
}
