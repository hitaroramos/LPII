public class Programa_2 
{
    public static void main(String[] args) 
    {
        Estagiario e1 = new Estagiario();
        e1.setNome("hiro");
        System.out.println(e1.getNome());
        e1.setCpf("12384"); 
        System.out.println(e1.getCpf());
        e1.gerarRelatorio(); 
        
        System.out.println("----------");

        Gerente g1 = new Gerente();
        g1.setNome("lilo");
        System.out.println(g1.getNome());
        g1.setCpf("1332384"); 
        System.out.println(g1.getCpf());
        g1.gerarRelatorio();  

        System.out.println("----------");

        Analista a1 = new Analista();
        a1.setNome("hiro");
        System.out.println(a1.getNome());
        a1.setCpf("12384"); 
        System.out.println(a1.getCpf());
        a1.gerarRelatorio();  
    }    
}
