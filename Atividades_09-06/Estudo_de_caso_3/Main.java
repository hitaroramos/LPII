
public class Main 
{
    public static void main(String[] args) 
    {
        Animal ave = new Ave("jorge", 12, "pelicano");

        ave.emitirSom();

        Animal cachorro = new Cachorro("bento", 5, "poodle");

        cachorro.emitirSom();

        Animal gato = new Gato("fogo", 14, "marrom");

        gato.emitirSom();
    }    
}
