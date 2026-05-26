package TV;
public class MainTV 
{
    public static void main(String[] args)
    {
        System.out.println("Especificações TV");
        TV television = new TV("CCE", 32, 220, 1);

        television.ligar();
        television.som(true);
        television.mudarCanal(true);
        television.desligar();

    }
    
}
