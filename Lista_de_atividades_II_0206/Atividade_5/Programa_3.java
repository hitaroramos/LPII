public class Programa_3 
{
    public static void main(String[] args) 
    {
        Calculadora c1 = new Calculadora(1);      
        Calculadora c2 = new Calculadora(true);   
        
        System.out.println(c1.somar(5, 10));      
        System.out.println(c1.somar(5.5, 2.3));   
    }    
}
