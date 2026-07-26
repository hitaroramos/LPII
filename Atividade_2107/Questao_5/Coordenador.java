package Questao_5;

public class Coordenador extends Instituicao implements Autenticacao
{
    String resultado;

    public Coordenador(String iNome, int iMatricula)
    {
        super(iNome, iMatricula);
    }

    public void coordenador()
    {
        System.out.println("Coordenador autenticado");
    }

    public String planoEnsino(boolean status)
    {
        if(status)
        {
            resultado = "Aprovado!";
        }
        else
        {
            resultado = "Negado...";
        }

        return resultado;
    }

    public void exibirDados()
    {
        System.out.println("-- Informações do(a) Coordenador(a) --");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Plano de ensino: " + resultado);
    }
    
}
