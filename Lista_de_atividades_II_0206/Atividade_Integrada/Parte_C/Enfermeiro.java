public class Enfermeiro extends Pessoa 
{
    public Enfermeiro(String nome, String cpf) 
    {
        super(nome, cpf);
    }

    @Override
    public void exibirPerfil() 
    {
        System.out.println("=== Enfermeiro ===");
        System.out.println("Nome: " + getNome());
    }
}
