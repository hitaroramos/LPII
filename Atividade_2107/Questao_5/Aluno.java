package Questao_5;

public class Aluno extends Instituicao implements Autenticacao
{
    public Aluno(String iNome, int iMatricula)
    {
        super(iNome, iMatricula);
    }
    public void realizarMatricula()
    {
        System.out.println("Matricula realizada");
    }

    public void aluno()
    {
        System.out.println("Aluno autenticado");
    }
    
    public void exibirDados()
    {
        System.out.println("-- Informações do(a) Aluno(a) --");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
    }
}