package Estudo_de_caso_1;

public class FuncionarioMensalista extends Funcionario
{
    float salarioFixo;

    public FuncionarioMensalista(String nome, String cpf, float salarioFixo)
    {
        super(nome, cpf);
        this.salarioFixo = salarioFixo;
    }   

    public float calcularPagamento(){ return salarioFixo; }

    public void exibirInformacoes()
    {
        System.out.println("Nome: " + nome + ", CPF: " + cpf + ", Salário: " 
        + calcularPagamento());
    }

}
