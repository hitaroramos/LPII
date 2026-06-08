public abstract class Funcionario
{
    private String nome;
    private String cpf;
    public abstract void gerarRelatorio();

    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getNome()
    {
        return this.nome;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }
    public String getCpf()
    {
        return this.cpf;
    }
}