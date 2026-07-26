package Questao_5;

public class Professor extends Instituicao implements Autenticacao
{
    String resposta;
    public Professor(String iNome, int iMatricula)
    {
        super(iNome, iMatricula);
    }

    public void professor()
    {
        System.out.println("Professor autenticado");
    }  
    
    public String ministrarDisciplina(String disciplina)
    {
        resposta = disciplina;
        return resposta;
    }
 
    public void exibirDados()
    {
        System.out.println("-- Informações do(a) Professor(a) --");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Ministrando: " + resposta);
    }
}
