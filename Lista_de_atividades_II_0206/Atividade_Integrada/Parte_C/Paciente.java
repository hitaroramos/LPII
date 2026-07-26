public class Paciente extends Pessoa 
{
    private int id;
    private Prontuario prontuario; 

    public Paciente(int id, String nome, String cpf, Prontuario prontuario) 
    {
        super(nome, cpf);
        this.id = id;
        this.prontuario = prontuario;
    }

    public int getId()               
    { 
        return id; 
    }
    public Prontuario getProntuario()
    {
        return prontuario; 
    }

    @Override
    public void exibirPerfil() 
    {
        System.out.println("=== Paciente ===");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Prontuário: " + prontuario.getDescricao());
    }
}
