import java.util.Date;
public class Funcionario 
{
    String nome;
    String cpf;
    String rg;
    private int matricula;
    private float salario;
    Date dataContratacao;
    private float salarioBase;
    private int horasTrabalhadas;
    private static int geraMatricula = 0;

    public Funcionario(String pNome,float pSalarioBase, int pHorasTrabalhadas)
    {
        this.nome = pNome;
        this.salarioBase = pSalarioBase;
        this.horasTrabalhadas = pHorasTrabalhadas;
        this.matricula = ++geraMatricula;
        dataContratacao = new Date();
    }

    public void calculaSalario()
    {
        Calculo c1 = new Calculo();
        c1.calculaSalario(salarioBase, horasTrabalhadas);
        salario = c1.getTotalSalario();
    }

    public float getSalario()
    {
        return salario;
    }

    public void setMatricula(int funcioMatricula)
    {
        this.matricula = funcioMatricula;
    }
    public int getMatricula()
    {
        return matricula;
    }

    public void imprimeDados()
    {
        System.out.println("Nome: " + nome + "CPF: " + cpf + "\nRG: " + rg 
        + "\nMatrícula: " + matricula + "\nSalário: " + salario 
        + "\nData Contratação: " + dataContratacao);
    }
}