package Estudo_de_caso_1;

public class Funcionario
{
    protected String nome;
    protected String cpf;

    public Funcionario(String nome, String cpf)
    {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public void exibirInformacoes() 
    {
        System.out.println("Nome: " + nome + ", CPF: " + cpf);
    }
}
