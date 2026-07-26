package Questao_3;
public class Coordenador extends Funcionario
{
    private float gratificacao_fixa;
    private float cSalario;

    public Coordenador(String fNome, int fMatricula, float fSalario, float gratificacao_fixa)
    {
        super(fNome, fMatricula, fSalario);
        this.gratificacao_fixa = gratificacao_fixa;
    }

    public void calcularsalario()
    {
        cSalario = this.salario + gratificacao_fixa;
        System.out.println("O salário do Coord. " + this.nome + " : R$" + cSalario); 
    }  
}