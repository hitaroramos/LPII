
public class Ave extends Animal
{
    private String tipo;
    
    public Ave(String nome, int idade, String tipo)
    {
        super(nome, idade);
        this.tipo = tipo;
    }   

    public void emitirSom()
    {
        System.out.println("Canto");
    }
}
