package Estudo_de_caso_1;

public class FuncionarioHorista extends Funcionario
{
    int horasTrabalhadas;
    float valorHora;

    public FuncionarioHorista(String nome, String cpf, int horasTrabalhadas,
    float valorHora)
    {
        super(nome, cpf);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;

    }  

    public float calcularPagamento()
    {
        float salarioHorista = valorHora * horasTrabalhadas;
        return salarioHorista;
    }

    public void exibirInformacoes()
    {
        System.out.println("Nome: " + nome + ", CPF: " + cpf + ", Salário: " 
        + calcularPagamento());
    }
}
