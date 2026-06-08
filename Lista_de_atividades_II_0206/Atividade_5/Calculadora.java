public class Calculadora 
{
    private int mudarModo;

    public Calculadora(int mudarModo)
    {
        this.mudarModo = mudarModo;
        if(mudarModo == 1)
        {
            System.out.println("Modo calculadora ativado.");
        }
    }
    
    public Calculadora(boolean iniciarMinecraft)
    {
        System.out.println("Iniciando Minecraft");
    }

    public double somar(int a, int b) 
    {
        return a + b;
    }

    public double somar(double a, double b) 
    {
        return a + b;
    }
    
}
