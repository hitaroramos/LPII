package CARRO;
public class Carro
{
    String modelo;
    float velocidade;
    float aceleracao;
    int marcha;

    public Carro(String modelo, float velocidade, float aceleracao, int marcha)
    {
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.marcha = marcha;
    }

    public boolean partida(boolean ligar)
    {
        if(ligar)
        {
            System.out.println("Ligando carro");
            return true;
        }
        else
        {
            System.out.println("Desligando carro");
            return false;
        }
    }

    public int trocaMarcha(boolean paraCima)
    {
        if(paraCima)
        {
            marcha++;
            System.out.println("Aumentou a marcha para: " + marcha);
        }
        else if(marcha < 0)
        {
            marcha--;
            System.out.println("Diminuiu a marcha para: " + marcha);
        }
        return marcha;
    }

    public void acelerar(boolean acelerando)
    {
        if(acelerando)
        {
            System.out.println("Acelerando");
        }
        else
        {
            System.out.println("Desacelerando");
        }
    }

    public void direcao(boolean esquerda)
    {
        if(esquerda)
        {
          System.out.println("Esquerda");  
        }
        else
        {
          System.out.println("Direita");  
        }
    }
}