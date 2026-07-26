package Questao_3;
public class Professor extends Funcionario
{
    private int hora_aula;
    private float valor_hora_aula;
    private float pSalario;

    public Professor(String fNome, int fMatricula, float fSalario, int hora_aula, float valor_hora_aula)
    {
        super(fNome, fMatricula, fSalario);
        this.hora_aula = hora_aula;
        this.valor_hora_aula = valor_hora_aula;
    }

    public void calcularsalario()
    {
        pSalario = this.salario + (hora_aula * valor_hora_aula);
        System.out.println("O salário do Prof. " + this.nome + " : R$" + pSalario);
    }
}