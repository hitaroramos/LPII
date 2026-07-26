package Questao_3;
public abstract class Funcionario
{
    protected int matricula;
    protected String nome;
    protected float salario;

    public Funcionario(String fNome, int fMatricula, float fSalario)
    {
        this.nome = fNome;
        this.matricula = fMatricula;
        this.salario = fSalario;
    }
    
    public abstract void calcularsalario();
}