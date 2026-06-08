package TV;
public class TV 
{
    int tamanhoTela;
    int volume;
    String marca;
    int voltagem;
    int canal;

    public TV(String marca, int tamanhoTela, int voltagem, int canal)
    {
        this.marca = marca;
        this.tamanhoTela = tamanhoTela;
        this.voltagem = voltagem;
        this.canal = canal;
        this.volume = 5;
        
    }

    public void ligar()
    {
        float consumo = voltagem * tamanhoTela;
        System.out.println("Ligando a tv. O consumo é: " + consumo);
    }

    public void desligar()
    {
        System.out.println("Desligando");
    }

    public int som(boolean aumentarVolume)
    {
       if(aumentarVolume && volume < 10) 
       {
            volume++;
            System.out.println("Aumentando o volume, para: " + volume);
       }
       else if(!aumentarVolume && volume > 0)
        {
            volume--;
            System.out.println("Diminuindo o volume, para: " + volume);
        }
        return volume;
    }

    public int mudarCanal(boolean paraCima)
    {
       if(paraCima) 
       {
            canal++;
            System.out.println("Subindo para o canal: " + canal);
       }
       else if(canal > 1)
        {
            canal--;
            System.out.println("Descendo para o canal: " + canal);
        }
        return canal;
    }
}
