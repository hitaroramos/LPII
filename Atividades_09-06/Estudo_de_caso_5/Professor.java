public class Professor extends Pessoa 
{
    private String disciplina;
    
    public Professor(String nome, String cpf, String disciplina)
    {
        super(nome, cpf);
        this.disciplina = disciplina;
    }

    public void exibirDados()
    {
        System.out.println("Professor - Nome: " + nome + " CPF: " + cpf + " Disciplina: " + disciplina);
    }
}
