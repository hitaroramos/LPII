public abstract class Funcionario
{
    protected String nome;
    protected String cpf;
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