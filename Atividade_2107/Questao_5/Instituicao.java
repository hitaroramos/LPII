package Questao_5;

public abstract class Instituicao 
{
    protected String nome;
    protected int matricula;

    public Instituicao(String iNome, int iMatricula)
    {
        this.nome = iNome;
        this.matricula = iMatricula;
    }
    
    public abstract void exibirDados(); 
}
