package Questao_3;
public class Tecnico extends Funcionario
{
    private float add_insalubridade;
    private float tSalario;

    public Tecnico(String fNome, int fMatricula, float fSalario, float add_insalubridade)
    {
        super(fNome, fMatricula, fSalario);
        this.add_insalubridade = add_insalubridade;
    }

    public void calcularsalario()
    {
        tSalario = this.salario + add_insalubridade;
        System.out.println("O salário da Tec. " + this.nome + " : R$" + tSalario);
    }   
}