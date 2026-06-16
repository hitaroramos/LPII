public class Funcionario 
{
    private int id;
    private String nome;
    private String matricula;
    private String cargo;

    public Funcionario(int id, String nome, String matricula, String cargo) 
    {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.cargo = cargo;
    }

    public int getId() 
    { 
        return id; 
    }
    public String getNome() 
    { 
        return nome; 
    }
}
